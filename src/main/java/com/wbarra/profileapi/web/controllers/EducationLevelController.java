package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.EducationLevel;
import com.wbarra.profileapi.domain.services.EducationLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educationLevels")
public class EducationLevelController {
    
    @Autowired
    private EducationLevelService service;

    @GetMapping("/all")
    public ResponseEntity<List<EducationLevel>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EducationLevel> getEducationLevelById(@PathVariable("id") Integer id) {
        return service.getEducationLevelById(id).map(address -> new ResponseEntity<>(address, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<EducationLevel> saveEducationLevel(@RequestBody EducationLevel educationLevel) {
        return new ResponseEntity<>(service.saveEducationLevel(educationLevel), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteEducationLevelById(@PathVariable("id") Integer id) {
        if (service.deleteEducationLevelById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<EducationLevel> updateEducationLevel(@RequestBody EducationLevel educationLevel) {
        return new ResponseEntity<>(service.updateEducationLevel(educationLevel), HttpStatus.OK);
    }
}
