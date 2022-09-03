package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.EducationDAO;
import org.springframework.data.repository.CrudRepository;

public interface EducationCrudRepository extends CrudRepository<EducationDAO, Integer> {
}
