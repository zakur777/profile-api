package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.Address;
import com.wbarra.profileapi.domain.gateways.AddressGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressGateway gateway;

    public List<Address> getAll() {
        return gateway.getAll();
    }

    public Optional<Address> getAddressById(Integer id) {
        return gateway.getAddressById(id);
    }

    public Address saveAddress(Address address) {
        return gateway.saveAddress(address);
    }

    public Boolean deleteAddresstById(Integer id) {
        return getAddressById(id).map(address -> {
            gateway.deleteAddress(id);
            return true;
        }).orElse(false);
    }
}
