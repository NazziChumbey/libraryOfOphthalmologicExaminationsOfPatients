package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.servicesImpl;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Patient;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories.PatientRepositories;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.PatientService;

import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private PatientRepositories patientRepositories;

    public PatientServiceImpl(PatientRepositories patientRepositories) {
        this.patientRepositories = patientRepositories;
    }

    @Override
    public Optional<Patient> findById(int id) {
        return patientRepositories.findById(id);
    }
}
