package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepositories extends CrudRepository<Patient, Integer> {

    Patient findByIdAndWorker_Id(Integer id, Integer workerID);

}
