package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.EducationLevelDAO;
import org.springframework.data.repository.CrudRepository;

public interface EducationLevelCrudRepository extends CrudRepository<EducationLevelDAO, Integer> {
}
