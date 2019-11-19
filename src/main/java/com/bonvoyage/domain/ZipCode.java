package com.bonvoyage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ZipCode {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Basic_Code")
    @NotEmpty(message = "{NotEmpty}")
    @Digits(integer = 5, fraction = 0, message = "{Digits}")
    private Long basicCode;

    @Column(name = "Plus_four")
    @Digits(integer = 4, fraction = 0, message = "{Digits}")
    private long plusFour;
}
