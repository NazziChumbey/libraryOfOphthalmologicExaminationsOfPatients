package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;


import lombok.Data;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@Entity
public class OphthalmicStatus {

    private int id;

    private Date dateOfTreatment;

    private int myotics;

    private int betaBlockers;

    private int prostaglandins;

    private int pbInjection;

    private int bbInjection;

    private int bmInjection;

    private int oralInjections;

    private int physiotherapy;

    private int rearSclerectomy;

    private int sinusothrabuculotomy;

    private int sinusotrabuculotomyWithBasaliridectomy;

    private int applicationOflaserTreatment;

    private int iridectomy;

    private int trabeculotomy;

    private int cyclodegradation;


    private String myoticsText;

    private String betaBlockersText;

    private String prostaglandinsText;

    private String pbInjectionText;

    private String bbInjectionText;

    private String bmInjectionText;

    private String oralInjectionsText;

    private String physiotherapyText;

    private String rearSclerectomyText;

    private String sinusothrabuculotomyText;

    private String sinusotrabuculotomyWithBasaliridectomyText;

    private String applicationOflaserTreatmentText;

    private String iridectomyText;

    private String trabeculotomyText;

    private String cyclodegradationText;

    private String infoTextArea;

}
