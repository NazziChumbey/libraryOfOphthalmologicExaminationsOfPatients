package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services;

import java.util.Set;

public interface GrudService<T, ID>  {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
