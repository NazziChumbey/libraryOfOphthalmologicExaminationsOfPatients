package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Worker;

public interface WorkerService extends GrudService<Worker, Integer> {

    Worker findWorkerPatient(int id, int patientID);

}
