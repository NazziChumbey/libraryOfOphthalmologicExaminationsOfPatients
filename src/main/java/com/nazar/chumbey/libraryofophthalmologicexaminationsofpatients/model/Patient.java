package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @Setter @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter @Getter
    private String additionalInfo;

    @Setter @Getter
    @Column(nullable = false)
    private String name;

    @Setter @Getter
    private int sex;

    @Setter @Getter
    private String telephone;

    @Setter @Getter
    @Column(nullable = false)
    private Date dateOfBirth;

    @Setter @Getter
    private String email;

    @Setter @Getter
    private String country;

    @Setter @Getter
    private String oblast;

    @Setter @Getter
    private String region;

    @Setter @Getter
    private String settlement;

    @Setter @Getter
    private String street;

    @Setter @Getter
    private String house;

    @Setter @Getter
    private String apartment;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @Column(nullable = false)
    private Set<Examination> examinations;

    @ManyToOne
    @JoinColumn(name="workers_id")
    private Workers worker;

}