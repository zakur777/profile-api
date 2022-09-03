package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.CertificateDAO;
import org.springframework.data.repository.CrudRepository;

public interface CertificateCrudRepository extends CrudRepository<CertificateDAO, Integer> {
}
