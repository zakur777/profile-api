package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.TypeDocument;
import com.wbarra.profileapi.domain.services.TypeDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typedocuments")
public class TypeDocumentController {

    @Autowired
    private TypeDocumentService service;

    @GetMapping("/all")
    public ResponseEntity<List<TypeDocument>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeDocument> getTypeDocumentById(@PathVariable("id") Integer id) {
        return service.getTypeDocumentById(id).map(document -> new ResponseEntity<>(document, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<TypeDocument> saveTypeDocument(@RequestBody TypeDocument typeDocument) {
        return new ResponseEntity<>(service.saveTypeDocument(typeDocument), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteTypeDocumentById(@PathVariable("id") Integer id) {
        if (service.deleteTypeDocumentById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }
}
