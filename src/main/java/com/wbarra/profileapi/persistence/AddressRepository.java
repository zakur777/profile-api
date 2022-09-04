package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.Address;
import com.wbarra.profileapi.domain.gateways.AddressGateway;
import com.wbarra.profileapi.persistence.crud.AddressCrudRepository;
import com.wbarra.profileapi.persistence.mappers.AddressMapper;
import com.wbarra.profileapi.persistence.models.AddressDAO;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AddressRepository implements AddressGateway {

    @Autowired
    private AddressCrudRepository crudRepository;

    @Autowired
    private AddressMapper mapper;

    @Override
    public List<Address> getAll() {
        List<AddressDAO> daos = (List<AddressDAO>) crudRepository.findAll();
        return mapper.toAddresses(daos);
    }

    @Override
    public Optional<Address> getAddressById(Integer id) {
        return crudRepository.findById(id).map(address -> mapper.toAddress(address));
    }

    @Override
    public Address saveAddress(Address address) {
        AddressDAO dao = mapper.toAddressDAO(address);
        return mapper.toAddress(crudRepository.save(dao));
    }

    @Override
    public void deleteAddress(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public Address update(Address address) {
        AddressDAO dao = mapper
                .toAddressDAO(getAddressById(address.getAddressId()).get());
        BeanUtils.copyProperties(address, dao);
        return mapper.toAddress(crudRepository.save(dao));
    }
}
