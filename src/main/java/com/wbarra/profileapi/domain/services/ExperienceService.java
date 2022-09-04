package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.domain.gateways.ExperienceGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceGateway gateway;

    public List<Experience> getAll() {
        return gateway.getAll();
    }

    public Optional<Experience> getExperienceById(Integer id) {
        return gateway.getExperienceById(id);
    }

    public Experience saveExperience(Experience experience) {
        return gateway.saveExperience(experience);
    }

    public Boolean deleteExperiencetById(Integer id) {
        return getExperienceById(id).map(experience -> {
            gateway.deleteExperience(id);
            return true;
        }).orElse(false);
    }

    public Experience updateExperience(Experience experience) {
        return gateway.update(experience);
    }

}
