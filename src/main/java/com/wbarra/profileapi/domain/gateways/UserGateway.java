package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserGateway {
    List<User> getAll();
    Optional<User> getUserById(Integer id);
    User saveUser(User user);
    void deleteUser(Integer id);
    Optional<List<User>> getByTypeDocumentId(Integer idTypeDocument);
}
