package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.domain.gateways.EducationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationService {
    
    @Autowired
    private EducationGateway gateway;

    public List<Education> getAll() {
        return gateway.getAll();
    }

    public Optional<Education> getEducationById(Integer id) {
        return gateway.getEducationById(id);
    }

    public Education saveEducation(Education education) {
        return gateway.saveEducation(education);
    }

    public Boolean deleteEducationById(Integer id) {
        return getEducationById(id).map(education -> {
            gateway.deleteEducation(id);
            return true;
        }).orElse(false);
    }

    public Education updateEducation(Education education) {
        return gateway.update(education);
    }
}
