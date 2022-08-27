package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Profile;
import com.wbarra.profileapi.persistence.models.ProfileDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        CertificateMapper.class,
        ExperienceMapper.class,
        EducationMapper.class
})
public interface ProfileMapper {

    @Mappings({
            @Mapping(source = "profileId", target = "profileId"),
            @Mapping(source = "educations", target = "educations"),
            @Mapping(source = "experiences", target = "experiences"),
            @Mapping(source = "certificates", target = "certificates"),
            @Mapping(source = "aboutMe", target = "aboutMe")
    })
    Profile toProfile(ProfileDAO dao);

    List<Profile> toProfiles(List<ProfileDAO> daos);

    @InheritInverseConfiguration
    ProfileDAO toProfileDAO(Profile profile);
}
