package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.Data;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@Entity
public class Workers {

    private int id;

    private String name;

    private Date dateOfBirth;

    private String institution;

    private String position;

    private String telephone;

    private String eMail;

    private String accessDatabaseType;

    private String accountStatus;

}
