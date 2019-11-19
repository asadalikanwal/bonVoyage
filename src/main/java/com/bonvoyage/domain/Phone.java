package com.bonvoyage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Area")
    @NotNull(message = "{NotNull}")
    @Digits(integer = 3, fraction = 0, message = "{Digits}")
    private Integer area;

    @Column(name = "{Prefix}")
    @NotNull(message = "{NotNull}")
    @Digits(integer = 3, fraction = 0, message = "{Digits}")
    private Integer prefix;

    @Column(name = "Number")
    @NotNull(message = "{NotNull}")
    @Digits(integer = 4, fraction = 0, message = "{Digits}")
    private Integer number;
}
