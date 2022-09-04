package com.wbarra.profileapi.persistence.mappers;

import com.wbarra.profileapi.domain.entities.Address;
import com.wbarra.profileapi.persistence.models.AddressDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Mappings({
            @Mapping(source = "addressId", target = "addressId" ),
            @Mapping(source = "city", target = "city"),
            @Mapping(source = "country", target = "country"),
            @Mapping(source = "postalCode", target = "postalCode"),
            @Mapping(source = "street", target = "street"),
            @Mapping(source = "createAt", target = "createAt"),
            @Mapping(source = "updateAt", target ="updateAt" ),
            @Mapping(source = "estado", target = "estado")
    })
    Address toAddress(AddressDAO dao);

    List<Address> toAddresses(List<AddressDAO> daos);

    @InheritInverseConfiguration
    AddressDAO toAddressDAO(Address address);
}
