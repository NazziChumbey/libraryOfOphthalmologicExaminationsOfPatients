package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Workers;

public interface WorkersService extends GrudService<Workers, Integer> {

    Workers findWorkerPatient(int id, int patientID);

}
