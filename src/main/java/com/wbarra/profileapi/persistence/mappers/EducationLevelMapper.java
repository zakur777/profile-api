package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.EducationLevel;
import com.wbarra.profileapi.persistence.models.EducationLevelDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EducationLevelMapper {

    @Mappings({
            @Mapping(source = "educationLevelId", target ="educationLevelId" ),
            @Mapping(source = "degree", target = "degree"),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado"),
    })
    EducationLevel toEducationLevel(EducationLevelDAO dao);

    List<EducationLevel> toEducationLevels(List<EducationLevelDAO> daos);

    @InheritInverseConfiguration
    EducationLevelDAO toEducationLevelDAO(EducationLevel educationLevel);
}
