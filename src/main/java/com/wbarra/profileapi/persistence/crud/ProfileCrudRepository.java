package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.ProfileDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProfileCrudRepository extends CrudRepository<ProfileDAO, Integer> {
}
