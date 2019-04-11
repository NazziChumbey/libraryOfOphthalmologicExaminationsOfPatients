package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.servicesImpl;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.Workers;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories.WorkersRepositories;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.WorkersService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class WorkersServiceImpl implements WorkersService {

    private WorkersRepositories workersRepositories;

    public WorkersServiceImpl(WorkersRepositories workersRepositories) {
        this.workersRepositories = workersRepositories;
    }

    @Override
    public Set<Workers> findAll() {
        Set<Workers> workers = new HashSet<>();
        workersRepositories.findAll().forEach(workers::add);
        return workers;
    }

    @Override
    public Workers findById(Integer id) {
        Optional<Workers> workersOptional = workersRepositories.findById(id);

        if (!workersOptional.isPresent()) {
            throw new RuntimeException("Workers Not Found!");
        }

        return workersOptional.get();
    }

    @Override
    public Workers save(Workers object) {
        return workersRepositories.save(object);
    }

    @Override
    public void delete(Workers object) {
        workersRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        workersRepositories.deleteById(id);
    }
}
