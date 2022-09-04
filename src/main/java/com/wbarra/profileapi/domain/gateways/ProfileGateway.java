package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.Profile;

import java.util.List;
import java.util.Optional;

public interface ProfileGateway {
    List<Profile> getAll();
    Optional<Profile> getProfileById(Integer id);
    Profile saveProfile(Profile profile);
    void deleteProfile(Integer id);

    Profile update(Profile profile);
}
