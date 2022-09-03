package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.UserDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCrudRepository extends CrudRepository<UserDAO, Integer> {
    List<UserDAO> findByTypeDocumentIdOrderByAgeAsc(Integer typeDocumentId);
    List<UserDAO> findByProfile_Certificates_educationLevelId(Integer educationLevelId);
}
