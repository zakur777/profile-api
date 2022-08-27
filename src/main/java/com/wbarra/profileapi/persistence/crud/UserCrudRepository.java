package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserDAO, Integer> {
}
