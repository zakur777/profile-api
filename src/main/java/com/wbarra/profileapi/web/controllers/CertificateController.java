package com.wbarra.profileapi.web.controllers;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {
    
    @Autowired
    private CertificateService service;

    @GetMapping("/all")
    public ResponseEntity<List<Certificate>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable("id") Integer id) {
        return service.getCertificateById(id).map(certificate -> new ResponseEntity<>(certificate, HttpStatus.OK))
                .orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Certificate> saveCertificate(@RequestBody Certificate certificate) {
        return new ResponseEntity<>(service.saveCertificate(certificate), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteCertificateById(@PathVariable("id") Integer id) {
        if (service.deleteCertificateById(id) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<Certificate> updateCertificate(@RequestBody Certificate education) {
        return new ResponseEntity<>(service.updateCertificate(education), HttpStatus.OK);
    }
}
