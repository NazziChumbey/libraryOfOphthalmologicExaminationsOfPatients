package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.servicesImpl;

import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model.RegistrationData;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.repositories.RegistrationDataRepositories;
import com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.services.RegistrationDataService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RegistrationDataServiceImpl implements RegistrationDataService {

    private RegistrationDataRepositories registrationDataRepositories;

    public RegistrationDataServiceImpl(RegistrationDataRepositories registrationDataRepositories) {
        this.registrationDataRepositories = registrationDataRepositories;
    }

    @Override
    public Set<RegistrationData> findAll() {
        Set<RegistrationData> registrationData = new HashSet<>();
        registrationDataRepositories.findAll().forEach(registrationData::add);
        return registrationData;
    }

    @Override
    public RegistrationData findById(Integer id) {
        Optional<RegistrationData> registrationDataOptional = registrationDataRepositories.findById(id);

        if (!registrationDataOptional.isPresent()) {
            throw new RuntimeException("Registration data Not Found!");
        }

        return registrationDataOptional.get();
    }

    @Override
    public RegistrationData save(RegistrationData object) {
        return registrationDataRepositories.save(object);
    }

    @Override
    public void delete(RegistrationData object) {
        registrationDataRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        registrationDataRepositories.deleteById(id);
    }
}
