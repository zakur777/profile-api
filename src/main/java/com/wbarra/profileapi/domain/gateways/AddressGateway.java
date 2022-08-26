package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.Address;

import java.util.List;
import java.util.Optional;

public interface AddressGateway {
    List<Address> getAll();
    Optional<Address> getAddressById(Integer id);
    Address saveAddress(Address address);
    void deleteAddress(Integer id);
}
