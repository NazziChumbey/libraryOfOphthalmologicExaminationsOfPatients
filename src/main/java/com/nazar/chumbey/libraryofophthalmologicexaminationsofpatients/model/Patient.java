package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dateOfBirth;

    private String additionalInfo;

    private int sex;

    private String telephone;

    private String email;

    private String country;

    private String oblast;

    private String region;

    private String settlement;

    private String street;

    private String house;

    private String apartment;

    @NonNull
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="workers_id")
    private Workers worker;

    @JsonBackReference
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Examination> examinations;
}