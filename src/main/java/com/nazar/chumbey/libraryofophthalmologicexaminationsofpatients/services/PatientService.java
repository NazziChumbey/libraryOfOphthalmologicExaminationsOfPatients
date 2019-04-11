package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Patient;

import java.util.Optional;

public interface PatientService {

    public Optional<Patient> findById(int id);


}
