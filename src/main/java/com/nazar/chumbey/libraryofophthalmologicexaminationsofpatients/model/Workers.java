package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    @JsonBackReference
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    private Set<Examination> examinations;

    @JsonBackReference
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    private Set<Patient> patients;
}