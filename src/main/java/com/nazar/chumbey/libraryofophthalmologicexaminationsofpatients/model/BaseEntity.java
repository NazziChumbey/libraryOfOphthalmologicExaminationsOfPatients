package com.nazar.chumbey.libraryofophthalmologicexaminationsofpatients.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
    @Id
    private Long id;
}
