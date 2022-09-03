package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.persistence.models.EducationDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EducationLevelMapper.class})
public interface EducationMapper {

    @Mappings({
            @Mapping(source = "educationId" , target = "educationId" ),
            @Mapping(source = "institutionName", target = "institutionName"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "nameOfTitle", target = "nameOfTitle" ),
            @Mapping(source = "educationLevelId", target = "educationLevelId" ),
            @Mapping(source = "educationLevel", target = "educationLevel" ),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado")
    })
    Education toEducation(EducationDAO dao);

    List<Education> toEducations(List<EducationDAO> daos);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target ="profileId", ignore = true),
            @Mapping(target ="profile", ignore = true )
    })
    EducationDAO toEducationDAO(Education education);
}
