package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.User;
import com.wbarra.profileapi.domain.gateways.UserGateway;
import com.wbarra.profileapi.persistence.crud.AddressCrudRepository;
import com.wbarra.profileapi.persistence.crud.ProfileCrudRepository;
import com.wbarra.profileapi.persistence.crud.UserCrudRepository;
import com.wbarra.profileapi.persistence.mappers.AddressMapper;
import com.wbarra.profileapi.persistence.mappers.ProfileMapper;
import com.wbarra.profileapi.persistence.mappers.UserMapper;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepository implements UserGateway {

    @Autowired
    private UserCrudRepository crudRepository;

    @Autowired
    private AddressCrudRepository addressCrudRepository;

    @Autowired
    private ProfileCrudRepository profileCrudRepository;

    @Autowired
    private UserMapper mapper;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public List<User> getAll() {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.findAll();
        return mapper.toUsers(daos);
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return crudRepository.findById(id).map(user -> mapper.toUser(user));
    }

    @Override
    public User saveUser(User user) {
        UserDAO dao = mapper.toUserDAO(user);
        return mapper.toUser(crudRepository.save(dao));
    }

    @Override
    public void deleteUser(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public Optional<List<User>> getByTypeDocumentId(Integer idTypeDocument) {
        List<UserDAO> daos = crudRepository.findByTypeDocumentIdOrderByAgeAsc(idTypeDocument);
        return Optional.of(mapper.toUsers(daos));
    }

    @Override
    public List<User> findByProfile_Certificates_educationLevelId(Integer educationLevelId) {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.findByProfile_Certificates_educationLevelId(educationLevelId);
        return mapper.toUsers(daos);
    }

    @Override
    public List<User> findByProfileMasterAndDoctorate() {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.findByProfileMasterAndDoctorate();
        daos.forEach(user -> {
            user.setAddress(addressCrudRepository.findById(user.getAddressId()).get());
            user.setProfile(profileCrudRepository.findById(user.getProfileId()).get());
        });
        return mapper.toUsers(daos);
    }

    @Override
    public List<User> finByProfileCityOrCountry(String city, String country) {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.finByProfileCityOrCountry(city, country);
        daos.forEach(user -> {
            user.setAddress(addressCrudRepository.findById(user.getAddressId()).get());
            user.setProfile(profileCrudRepository.findById(user.getProfileId()).get());
        });
        return mapper.toUsers(daos);
    }

    @Override
    public List<User> findChangeOfResidence() {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.findChangeOfResidence();
        return mapper.toUsers(daos);
    }

    @Override
    public User update(User user) {
        UserDAO dao = mapper
                .toUserDAO(getUserById(user.getUserId()).get());
        BeanUtils.copyProperties(user, dao);
        return mapper.toUser(crudRepository.save(dao));
    }

    @Override
    public List<User> findAllUsersPeopleWithMoreThanCertainYearsOfExperience(Integer years) {
        List<UserDAO> daos = (List<UserDAO>) crudRepository
                .findAllUsersPeopleWithMoreThanCertainYearsOfExperience(years);
        return mapper.toUsers(daos);
    }
}
