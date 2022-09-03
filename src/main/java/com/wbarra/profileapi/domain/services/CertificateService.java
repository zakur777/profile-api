package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.gateways.CertificateGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {
    
    @Autowired
    private CertificateGateway gateway;

    public List<Certificate> getAll() {
        return gateway.getAll();
    }

    public Optional<Certificate> getCertificateById(Integer id) {
        return gateway.getCertificateById(id);
    }

    public Certificate saveCertificate(Certificate certificate) {
        return gateway.saveCertificate(certificate);
    }

    public Boolean deleteCertificateById(Integer id) {
        return getCertificateById(id).map(education -> {
            gateway.deleteCertificate(id);
            return true;
        }).orElse(false);
    }

    public Certificate updateCertificate(Certificate education) {
        return gateway.update(education);
    }
}
