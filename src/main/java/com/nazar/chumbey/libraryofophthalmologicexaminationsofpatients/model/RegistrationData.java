package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class RegistrationData{

    private int id;

    private String login;

    private String password;
}
