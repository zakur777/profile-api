package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.EducationLevel;

import java.util.List;
import java.util.Optional;

public interface EducationLevelGateway {

    List<EducationLevel> getAll();
    Optional<EducationLevel> getEducationLevelById(Integer id);
    EducationLevel saveEducationLevel(EducationLevel educationLevel);
    void deleteEducationLevel(Integer id);

    EducationLevel update(EducationLevel educationLevel);
}
