package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.TypeDocument;
import com.wbarra.profileapi.persistence.models.TypeDocumentDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeDocumentMapper {

    @Mappings({
            @Mapping(source ="typeDocumentId" , target = "typeDocumentId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado")
    })
    TypeDocument toTypeDocument(TypeDocumentDAO dao);

    List<TypeDocument> toTypeDocuments(List<TypeDocumentDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "users", ignore = true)
    TypeDocumentDAO toTypeDocumentDAO(TypeDocument typeDocument);
}
