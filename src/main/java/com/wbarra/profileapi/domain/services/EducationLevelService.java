package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.EducationLevel;
import com.wbarra.profileapi.domain.gateways.EducationLevelGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationLevelService {
    
    @Autowired
    private EducationLevelGateway gateway;

    public List<EducationLevel> getAll() {
        return gateway.getAll();
    }

    public Optional<EducationLevel> getEducationLevelById(Integer id) {
        return gateway.getEducationLevelById(id);
    }

    public EducationLevel saveEducationLevel(EducationLevel educationLevel) {
        return gateway.saveEducationLevel(educationLevel);
    }

    public Boolean deleteEducationLevelById(Integer id) {
        return getEducationLevelById(id).map(address -> {
            gateway.deleteEducationLevel(id);
            return true;
        }).orElse(false);
    }

    public EducationLevel updateEducationLevel(EducationLevel educationLevel) {
        return gateway.update(educationLevel);
    }
}
