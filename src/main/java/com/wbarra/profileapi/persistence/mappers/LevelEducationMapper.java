package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.domain.entities.LevelEducation;
import com.wbarra.profileapi.persistence.models.ExperienceDAO;
import com.wbarra.profileapi.persistence.models.LevelEducationDAO;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface LevelEducationMapper {

    @ValueMappings({
            @ValueMapping(source = "UNDERGRADUATE" , target = "UNDERGRADUATE" ),
            @ValueMapping(source = "MASTERS" , target = "MASTERS" ),
            @ValueMapping(source = "DOCTORATE" , target = "DOCTORATE" ),
    })
    LevelEducation toLevelEducation(LevelEducationDAO dao);

    @InheritInverseConfiguration
    LevelEducationDAO toLevelEducationDAO(LevelEducation levelEducation);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target ="profileId", ignore = true),
            @Mapping(target ="profile", ignore = true )
    })
    ExperienceDAO toExperienceDAO(Experience experience);
}
