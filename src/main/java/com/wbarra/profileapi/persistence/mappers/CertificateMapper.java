package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LevelEducationMapper.class})
public interface CertificateMapper {

    @Mappings({
            @Mapping(source = "certificateId", target = "certificateId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "institution", target = "institution"),
            @Mapping(source = "levelEducation", target = "levelEducation"),
    })
    Certificate toCertificate(CertificateDAO dao);

    List<Certificate> toCertificates(List<CertificateDAO> daos);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target ="profileId", ignore = true),
            @Mapping(target ="profile", ignore = true )
    })
    CertificateDAO toCertificateDAO(Certificate certificate);
}
