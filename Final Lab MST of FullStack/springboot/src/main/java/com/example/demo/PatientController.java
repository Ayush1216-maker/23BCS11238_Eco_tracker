package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PatientController {

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getPatients() {
        List<Patient> patients = Arrays.asList(
                new Patient(1L, "John Doe", 45),
                new Patient(2L, "Jane Smith", 32),
                new Patient(3L, "Bob Johnson", 60)
        );
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PostMapping("/patient")
    public ResponseEntity<String> createPatient(@RequestBody Patient patient) {
        System.out.println("Received patient: " + patient);
        return new ResponseEntity<>("Patient created successfully", HttpStatus.CREATED);
    }
}
