package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Date dateOfBirth;

    private String institution;

    private String position;

    private String telephone;

    private String eMail;

    private String accessDatabaseType;

    private String accountStatus;

    @OneToMany(mappedBy = "worker")
    private Set<Examination> examinations;

    @OneToMany(mappedBy = "worker")
    private Set<Patient> patients;

    @OneToOne
    @JoinColumn(name = "registrationData_id")
    private RegistrationData registrationData;
}