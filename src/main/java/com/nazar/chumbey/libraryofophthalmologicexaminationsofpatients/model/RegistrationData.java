package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RegistrationData{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login;

    private String password;

    @OneToOne(mappedBy="registrationData")
    public Workers worker;
}
