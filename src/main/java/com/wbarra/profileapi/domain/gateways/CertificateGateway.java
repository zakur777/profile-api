package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.Certificate;

import java.util.List;
import java.util.Optional;

public interface CertificateGateway {
    List<Certificate> getAll();
    Optional<Certificate> getCertificateById(Integer id);
    Certificate saveCertificate(Certificate certificate);
    void deleteCertificate(Integer id);
}
