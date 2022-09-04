package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.Experience;

import java.util.List;
import java.util.Optional;

public interface ExperienceGateway {
    List<Experience> getAll();
    Optional<Experience> getExperienceById(Integer id);
    Experience saveExperience(Experience experience);
    void deleteExperience(Integer id);

    Experience update(Experience experience);
}
