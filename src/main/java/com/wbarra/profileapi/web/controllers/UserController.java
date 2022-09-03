package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.User;
import com.wbarra.profileapi.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService service;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        return service.getUserById(id).map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(service.saveUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable("id") Integer id) {
        if (service.deleteUsertById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/typeDocument/{id}")
    public ResponseEntity<Optional<List<User>>> getUsersByTypeDocumentId(@PathVariable("id") Integer id){
        return new ResponseEntity<>(service.getUsersByTypeDocumentId(id), HttpStatus.OK);
    }

    @GetMapping("/all/pregrade")
    public ResponseEntity<List<User>> findByProfile_Certificates_educationLevelId() {
        return new ResponseEntity<>(service.findByProfile_Certificates_educationLevelId(11), HttpStatus.OK);
    }

    @GetMapping("/all/doctorate_o_master")
    public ResponseEntity<List<User>> findByProfileMasterAndDoctorate() {
        return new ResponseEntity<>(service.findByProfileMasterAndDoctorate(), HttpStatus.OK);
    }

    @GetMapping("/all/city_or_country/{city}/{country}")
    public ResponseEntity<List<User>> finByProfileCityOrCountry(@PathVariable("city") String city,
                                                                @PathVariable("country") String country) {
        return new ResponseEntity<>(service.finByProfileCityOrCountry(city.toUpperCase(), country.toUpperCase()), HttpStatus.OK);
    }

    @GetMapping("/all/chageOfResidence")
    public ResponseEntity<List<User>> findChangeOfResidence() {
        return new ResponseEntity<>(service.findChangeOfResidence(), HttpStatus.OK);
    }
}
