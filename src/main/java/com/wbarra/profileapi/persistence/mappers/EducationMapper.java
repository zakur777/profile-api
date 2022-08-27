package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.persistence.models.EducationDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LevelEducationMapper.class})
public interface EducationMapper {

    @Mappings({
            @Mapping(source = "educationId" , target = "educationId" ),
            @Mapping(source = "institutionName", target = "institutionName"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "nameOfTitle", target = "nameOfTitle" ),
            @Mapping(source = "levelEducation", target = "levelEducation"),
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
