package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.controllers;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Patient;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping({"/patients"})
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(path = {"/{id}"})
    public Patient findOne(@PathVariable("id") Integer id) {
        return patientService.findById(id);
    }

    @GetMapping(path = {"/"})
    public Set<Patient> findAll() {
        return patientService.findAll();
    }

    @RequestMapping(path = {"/delete/{id}"}, method = RequestMethod.GET)
    public void delete(@PathVariable("id") int id) {
        patientService.deleteById(id);
    }
}