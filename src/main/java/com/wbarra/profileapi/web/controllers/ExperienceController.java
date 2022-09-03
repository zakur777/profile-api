package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.Experience;
import com.wbarra.profileapi.domain.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    @Autowired
    private ExperienceService service;

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("id") Integer id) {
        return service.getExperienceById(id).map(profile -> new ResponseEntity<>(profile, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Experience> saveExperience(@RequestBody Experience experience) {
        return new ResponseEntity<>(service.saveExperience(experience), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteExperienceById(@PathVariable("id") Integer id) {
        if (service.deleteExperiencetById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }
}
