package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.EducationLevel;
import com.wbarra.profileapi.domain.gateways.EducationLevelGateway;
import com.wbarra.profileapi.persistence.crud.EducationLevelCrudRepository;
import com.wbarra.profileapi.persistence.mappers.EducationLevelMapper;
import com.wbarra.profileapi.persistence.models.EducationLevelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;

@Repository
public class EducationLevelRepository implements EducationLevelGateway {

    @Autowired
    private EducationLevelCrudRepository crudRepository;

    @Autowired
    private EducationLevelMapper mapper;

    @Override
    public List<EducationLevel> getAll() {
        List<EducationLevelDAO> daos = (List<EducationLevelDAO>) crudRepository.findAll();
        return mapper.toEducationLevels(daos);
    }

    @Override
    public Optional<EducationLevel> getEducationLevelById(Integer id) {
        return crudRepository.findById(id).map(educationLevel -> mapper.toEducationLevel(educationLevel));
    }

    @Override
    public EducationLevel saveEducationLevel(EducationLevel educationLevel) {
        EducationLevelDAO dao = mapper.toEducationLevelDAO(educationLevel);
        return mapper.toEducationLevel(crudRepository.save(dao));
    }

    @Override
    public void deleteEducationLevel(Integer id) {
        EducationLevelDAO dao = mapper.toEducationLevelDAO(getEducationLevelById(id).get());
        dao.setEstado("0");
        crudRepository.save(dao);
    }

    @Override
    public EducationLevel update(EducationLevel educationLevel) {
        EducationLevelDAO dao = mapper
                .toEducationLevelDAO(getEducationLevelById(educationLevel.getEducationLevelId()).get());
        BeanUtils.copyProperties(educationLevel, dao);
        return mapper.toEducationLevel(crudRepository.save(dao));
    }
}
