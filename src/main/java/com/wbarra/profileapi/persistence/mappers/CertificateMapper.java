package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EducationLevelMapper.class})
public interface CertificateMapper {

    @Mappings({
            @Mapping(source = "certificateId", target = "certificateId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "institution", target = "institution"),
            @Mapping(source = "profileId", target = "profileId" ),
            @Mapping(source = "educationLevelId", target = "educationLevelId" ),
            @Mapping(source = "educationLevel", target = "educationLevel" ),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado")
    })
    Certificate toCertificate(CertificateDAO dao);

    List<Certificate> toCertificates(List<CertificateDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target ="profile", ignore = true )
    CertificateDAO toCertificateDAO(Certificate certificate);
}
