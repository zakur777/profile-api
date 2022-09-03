package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.domain.gateways.EducationGateway;
import com.wbarra.profileapi.persistence.crud.EducationCrudRepository;
import com.wbarra.profileapi.persistence.mappers.EducationMapper;
import com.wbarra.profileapi.persistence.models.EducationDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EducationRepository implements EducationGateway {
    
    @Autowired
    private EducationCrudRepository crudRepository;
    
    @Autowired
    private EducationMapper mapper;

    @Override
    public List<Education> getAll() {
        List<EducationDAO> daos = (List<EducationDAO>) crudRepository.findAll();
        return mapper.toEducations(daos);
    }

    @Override
    public Optional<Education> getEducationById(Integer id) {
        return crudRepository.findById(id).map(education -> mapper.toEducation(education));
    }

    @Override
    public Education saveEducation(Education educationLevel) {
        EducationDAO dao = mapper.toEducationDAO(educationLevel);
        return mapper.toEducation(crudRepository.save(dao));
    }

    @Override
    public void deleteEducation(Integer id) {
        EducationDAO dao = mapper.toEducationDAO(getEducationById(id).get());
        dao.setEstado("0");
        crudRepository.save(dao);
    }

    @Override
    public Education update(Education education) {
        EducationDAO dao = mapper
                .toEducationDAO(getEducationById(education.getEducationId()).get());
        BeanUtils.copyProperties(education, dao);
        return mapper.toEducation(crudRepository.save(dao));
    }
}
