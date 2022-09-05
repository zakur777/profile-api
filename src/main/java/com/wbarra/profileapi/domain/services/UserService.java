package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.User;
import com.wbarra.profileapi.domain.gateways.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserGateway gateway;

    public List<User> getAll() {
        return gateway.getAll();
    }

    public Optional<User> getUserById(Integer id) {
        return gateway.getUserById(id);
    }

    public User saveUser(User user) {
        return gateway.saveUser(user);
    }

    public Boolean deleteUsertById(Integer id) {
        return getUserById(id).map(user -> {
            gateway.deleteUser(id);
            return true;
        }).orElse(false);
    }

    public Optional<List<User>> getUsersByTypeDocumentId(Integer idTypeDocument) {
        return gateway.getByTypeDocumentId(idTypeDocument);
    }

    public List<User> findByProfile_Certificates_educationLevelId(Integer educationLevelId) {
        return gateway.findByProfile_Certificates_educationLevelId(educationLevelId);
    }

    public List<User> findByProfileMasterAndDoctorate() {
        return gateway.findByProfileMasterAndDoctorate();
    }

    public List<User> finByProfileCityOrCountry(String city, String country) {
        return gateway.finByProfileCityOrCountry(city, country);
    }

    public List<User> findChangeOfResidence() {
        return gateway.findChangeOfResidence();
    }

    public User updateUser(User user) {
        return gateway.update(user);
    }

    public List<User> findAllUsersPeopleWithMoreThanCertainYearsOfExperience(Integer years) {
        return gateway.findAllUsersPeopleWithMoreThanCertainYearsOfExperience(years);
    }

    public List<User> FindUsersBySkill(String skill) {
        return gateway.FindUsersBySkill(skill);
    }
}
