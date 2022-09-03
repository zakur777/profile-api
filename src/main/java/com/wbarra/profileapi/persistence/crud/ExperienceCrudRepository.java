package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.persistence.models.ExperienceDAO;
import org.springframework.data.repository.CrudRepository;

public interface ExperienceCrudRepository extends CrudRepository<ExperienceDAO, Integer> {
}
