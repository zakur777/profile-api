package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.domain.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educations")
public class EducationController {

    @Autowired
    private EducationService service;

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable("id") Integer id) {
        return service.getEducationById(id).map(education -> new ResponseEntity<>(education, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Education> saveEducation(@RequestBody Education education) {
        return new ResponseEntity<>(service.saveEducation(education), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteEducationById(@PathVariable("id") Integer id) {
        if (service.deleteEducationById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        return new ResponseEntity<>(service.updateEducation(education), HttpStatus.OK);
    }
}
