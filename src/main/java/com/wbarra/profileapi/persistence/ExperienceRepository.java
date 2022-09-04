package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.domain.gateways.ExperienceGateway;
import com.wbarra.profileapi.persistence.crud.ExperienceCrudRepository;
import com.wbarra.profileapi.persistence.mappers.ExperienceMapper;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import com.wbarra.profileapi.persistence.models.ExperienceDAO;
import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;
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
        calculateYearOfExperience(dao);
        return mapper.toExperience(crudRepository.save(dao));
    }


    @Override
    public void deleteExperience(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public Experience update(Experience experience) {
        ExperienceDAO dao = mapper
                .toExperienceDAO(getExperienceById(experience.getExperienceId()).get());
        calculateYearOfExperience(dao);
        BeanUtils.copyProperties(experience, dao);
        return mapper.toExperience(crudRepository.save(dao));
    }

    private void calculateYearOfExperience(ExperienceDAO dao) {
        LocalDate startDate = dao.getStartDate();
        LocalDate endDate;
        LocalDate now;
        Period period;

        if (Objects.isNull(dao.getEndDate())) {
            now = LocalDate.now();
            period = Period.between(startDate, now);
        } else {
            endDate = dao.getEndDate();
            period = Period.between(startDate, endDate);
        }

        dao.setYearsOfExperience(period.getYears());
    }
}
