package com.wbarra.profileapi.domain.services;

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
}
