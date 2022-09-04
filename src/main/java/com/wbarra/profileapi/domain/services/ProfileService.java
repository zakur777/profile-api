package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.Profile;
import com.wbarra.profileapi.domain.gateways.ProfileGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    
    @Autowired
    private ProfileGateway gateway;

    public List<Profile> getAll() {
        return gateway.getAll();
    }

    public Optional<Profile> getProfileById(Integer id) {
        return gateway.getProfileById(id);
    }

    public Profile saveProfile(Profile profile) {
        return gateway.saveProfile(profile);
    }

    public Boolean deleteProfiletById(Integer id) {
        return getProfileById(id).map(profile -> {
            gateway.deleteProfile(id);
            return true;
        }).orElse(false);
    }

    public Profile updateProfile(Profile profile) {
        return gateway.update(profile);
    }
}
