package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.Data;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@Entity
public class Workers extends BaseEntity{

    public Workers(Long id,String name, Date dateOfBirth, String institution, String position, String telephone, String eMail, String accessDatabaseType, String accountStatus) {
        super.setId(id);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.institution = institution;
        this.position = position;
        this.telephone = telephone;
        this.eMail = eMail;
        this.accessDatabaseType = accessDatabaseType;
        this.accountStatus = accountStatus;
    }

    private String name;

    private Date dateOfBirth;

    private String institution;

    private String position;

    private String telephone;

    private String eMail;

    private String accessDatabaseType;

    private String accountStatus;

}
