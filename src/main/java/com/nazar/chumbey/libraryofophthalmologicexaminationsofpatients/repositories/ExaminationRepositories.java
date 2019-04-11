package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Examination;
import org.springframework.data.repository.CrudRepository;

public interface ExaminationRepositories extends CrudRepository<Examination, Integer>{

}