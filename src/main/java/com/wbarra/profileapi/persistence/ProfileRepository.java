package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Profile;
import com.wbarra.profileapi.domain.gateways.ProfileGateway;
import com.wbarra.profileapi.persistence.crud.ProfileCrudRepository;
import com.wbarra.profileapi.persistence.mappers.ProfileMapper;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import com.wbarra.profileapi.persistence.models.ProfileDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class ProfileRepository implements ProfileGateway {
    
    @Autowired
    private ProfileCrudRepository crudRepository;
    
    @Autowired
    private ProfileMapper mapper;

    @Override
    public List<Profile> getAll() {
        List<ProfileDAO> daos = (List<ProfileDAO>) crudRepository.findAll();
        return mapper.toProfiles(daos);
    }

    @Override
    public Optional<Profile> getProfileById(Integer id) {
        return crudRepository.findById(id).map(profile -> mapper.toProfile(profile));
    }

    @Override
    public Profile saveProfile(Profile profile) {
        ProfileDAO dao = mapper.toProfileDAO(profile);
        return mapper.toProfile(crudRepository.save(dao));
    }

    @Override
    public void deleteProfile(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public Profile update(Profile profile) {
        ProfileDAO dao = mapper
                .toProfileDAO(getProfileById(profile.getProfileId()).get());
        BeanUtils.copyProperties(profile, dao);
        return mapper.toProfile(crudRepository.save(dao));
    }
}
