package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.domain.gateways.ExperienceGateway;
import com.wbarra.profileapi.persistence.crud.ExperienceCrudRepository;
import com.wbarra.profileapi.persistence.mappers.ExperienceMapper;
import com.wbarra.profileapi.persistence.models.ExperienceDAO;
import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ExperienceRepository implements ExperienceGateway {

    @Autowired
    private ExperienceCrudRepository crudRepository;

    @Autowired
    private ExperienceMapper mapper;


    @Override
    public List<Experience> getAll() {
        List<ExperienceDAO> daos = (List<ExperienceDAO>) crudRepository.findAll();
        return mapper.toExperiences(daos);
    }

    @Override
    public Optional<Experience> getExperienceById(Integer id) {
        return crudRepository.findById(id).map(experience -> mapper.toExperience(experience));
    }

    @Override
    public Experience saveExperience(Experience experience) {
        ExperienceDAO dao = mapper.toExperienceDAO(experience);
        return mapper.toExperience(crudRepository.save(dao));
    }

    @Override
    public void deleteExperience(Integer id) {
        crudRepository.deleteById(id);
    }

}
