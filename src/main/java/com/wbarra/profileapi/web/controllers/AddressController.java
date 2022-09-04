package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.Address;
import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    
    @Autowired
    private AddressService service;

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") Integer id) {
        return service.getAddressById(id).map(address -> new ResponseEntity<>(address, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
        return new ResponseEntity<>(service.saveAddress(address), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAddressById(@PathVariable("id") Integer id) {
        if (service.deleteAddresstById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        return new ResponseEntity<>(service.updateAddress(address), HttpStatus.OK);
    }
}
