package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.persistence.models.ExperienceDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {

    @Mappings({
            @Mapping(source = "experienceId", target = "experienceId" ),
            @Mapping(source = "positionName", target = "positionName"),
            @Mapping(source = "companyName", target = "companyName"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "country", target = "country"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "profileId", target = "profileId"),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado")
    })
    Experience toExperience(ExperienceDAO dao);

    List<Experience> toExperiences(List<ExperienceDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "yearsOfExperience", ignore = true )
    ExperienceDAO toExperienceDAO(Experience experience);

}
