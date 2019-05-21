package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepositories extends CrudRepository<Worker, Integer> {

    Worker findByIdAndPatients_id(int id, int patientID);
}
