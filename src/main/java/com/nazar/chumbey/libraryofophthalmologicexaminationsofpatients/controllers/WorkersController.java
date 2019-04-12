package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.controllers;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Workers;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.WorkersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/workers"})
public class WorkersController {

    private WorkersService workersService;

    public WorkersController(WorkersService workersService) {
        this.workersService = workersService;
    }

    @GetMapping(path = {"/{id}"})
    public Workers findAll(@PathVariable("id") int id) {
        return workersService.findById(id);
    }

    @GetMapping(path = {"/{id}/patients/{patientID}"})
    public Workers findAll(@PathVariable("id") int id,@PathVariable("patientID") int patientID) {
        return workersService.findWorkerPatient(id,patientID);
    }

}
