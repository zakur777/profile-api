package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.User;
import com.wbarra.profileapi.persistence.models.UserDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        ProfileMapper.class,
        TypeDocumentMapper.class
})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "userId", target = "userId"),
            @Mapping(source = "identicationNumber", target = "identicationNumber"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "typeDocumentId", target = "typeDocumentId"),
            @Mapping(source = "typeDocument", target = "typeDocument"),
            @Mapping(source = "mail", target = "mail"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "addressId", target = "addressId"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "skill", target = "skill"),
            @Mapping(source = "changeOfResidence", target = "changeOfResidence"),
            @Mapping(source = "birthday", target = "birthday"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "profileId", target = "profileId"),
            @Mapping(source = "profile", target = "profile")
    })
    User toUser(UserDAO dao);

    List<User> toUsers(List<UserDAO> daos);

    @InheritInverseConfiguration
    UserDAO toUserDAO(User user);
}
