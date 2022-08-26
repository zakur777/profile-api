package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.TypeDocumentDAO;
import org.springframework.data.repository.CrudRepository;

public interface TypeDocumentCrudRepository  extends CrudRepository<TypeDocumentDAO, Integer> {
}
