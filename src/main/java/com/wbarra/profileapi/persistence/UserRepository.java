package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.User;
import com.wbarra.profileapi.domain.gateways.UserGateway;
import com.wbarra.profileapi.persistence.crud.UserCrudRepository;
import com.wbarra.profileapi.persistence.mappers.UserMapper;
import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements UserGateway {

    @Autowired
    private UserCrudRepository crudRepository;

    @Autowired
    private UserMapper mapper;

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
}
