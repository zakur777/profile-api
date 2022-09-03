package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.domain.entities.Education;

import java.util.List;
import java.util.Optional;

public interface EducationGateway {
    List<Education> getAll();
    Optional<Education> getEducationById(Integer id);
    Education saveEducation(Education education);
    void deleteEducation(Integer id);
    Education update(Education educationLevel);
}
