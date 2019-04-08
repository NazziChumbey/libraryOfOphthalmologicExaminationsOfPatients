package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Data;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@Entity
public class Patient extends BaseEntity {

    private String name;

    private int sex;

    private String numberTelephone;

    private Date dateOfBirth;

    private String eMail;

    private String country;

    private String oblast;

    private String region;

    private String settlement;

    private String street;

    private String house;

    private String apartment;

    private String additional_information;

    private Long workers_id;

}
