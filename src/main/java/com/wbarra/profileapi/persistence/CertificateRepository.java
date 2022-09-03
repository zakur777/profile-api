package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.gateways.CertificateGateway;
import com.wbarra.profileapi.persistence.crud.CertificateCrudRepository;
import com.wbarra.profileapi.persistence.mappers.CertificateMapper;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CertificateRepository implements CertificateGateway {
    
    @Autowired
    private CertificateCrudRepository crudRepository;
    
    @Autowired
    private CertificateMapper mapper;

    @Override
    public List<Certificate> getAll() {
        List<CertificateDAO> daos = (List<CertificateDAO>) crudRepository.findAll();
        return mapper.toCertificates(daos);
    }

    @Override
    public Optional<Certificate> getCertificateById(Integer id) {
        return crudRepository.findById(id).map(certificate -> mapper.toCertificate(certificate));
    }

    @Override
    public Certificate saveCertificate(Certificate certificate) {
        CertificateDAO dao = mapper.toCertificateDAO(certificate);
        return mapper.toCertificate(crudRepository.save(dao));
    }

    @Override
    public void deleteCertificate(Integer id) {
        CertificateDAO dao = mapper.toCertificateDAO(getCertificateById(id).get());
        dao.setEstado("0");
        crudRepository.save(dao);
    }

    @Override
    public Certificate update(Certificate certificate) {
        CertificateDAO dao = mapper
                .toCertificateDAO(getCertificateById(certificate.getCertificateId()).get());
        BeanUtils.copyProperties(certificate, dao);
        return mapper.toCertificate(crudRepository.save(dao));
    }
}
