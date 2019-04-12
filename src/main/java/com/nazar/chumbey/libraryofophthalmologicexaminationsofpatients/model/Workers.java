package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @Column(nullable = false)
    private Set<Examination> examinations;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @Column(nullable = false)
    private Set<Patient> patients;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dateOfBirth;

    private String institution;

    private String position;

    private String telephone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String accessDatabaseType;

    @Column(nullable = false)
    private String accountStatus;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

}