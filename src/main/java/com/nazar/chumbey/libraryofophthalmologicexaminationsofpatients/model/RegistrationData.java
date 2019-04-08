package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class RegistrationData extends BaseEntity{

    public RegistrationData(Long id ,String login, String password) {
        super.setId(id);
        this.login = login;
        this.password = password;
    }

    private String login;

    private String password;
}
