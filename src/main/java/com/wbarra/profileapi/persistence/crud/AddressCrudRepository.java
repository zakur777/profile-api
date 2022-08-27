package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.AddressDAO;
import org.springframework.data.repository.CrudRepository;

public interface AddressCrudRepository extends CrudRepository<AddressDAO, Integer> {
}
