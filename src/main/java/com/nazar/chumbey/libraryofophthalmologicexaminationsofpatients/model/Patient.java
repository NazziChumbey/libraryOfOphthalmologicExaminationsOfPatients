package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String additionalInfo;

    private String name;

    private int sex;

    private String telephone;

    private Date dateOfBirth;

    private String eMail;

    private String country;

    private String oblast;

    private String region;

    private String settlement;

    private String street;

    private String house;

    private String apartment;

    @OneToMany(mappedBy = "patient")
    private Set<Examination> examinations;

    @ManyToOne
    @JoinColumn(name="workers_id")
    private Workers worker;
}
