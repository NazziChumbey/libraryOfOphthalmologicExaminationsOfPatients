package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Examination;

public interface ExaminationService extends GrudService<Examination, Integer> {

    public Examination findById(Integer id);
}
