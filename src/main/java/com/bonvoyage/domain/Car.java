package com.bonvoyage.domain;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    private String plateNo;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate licenseExpirationDate;
    @NotBlank
    private String manufacturer;
    @NotBlank
    private String model;
    @NotNull
    @Range(min = 1900, message = "{Size.makeYear.Validation}")
    private int makeYear;
    @NotBlank
    private String color;
    @NotNull
    @Range(min = 1, max = 20, message = "{Size.maxNoOfPassengers.Validation}")
    private int maxNoOfPassengers;


    private Driver driver;

    public Car() {  }

    public Car(String plateNo, LocalDate licenseExpirationDate, String manufacturer, String model, int makeYear, String color, int maxNoOfPassengers) {
        this.plateNo = plateNo;
        this.licenseExpirationDate = licenseExpirationDate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.makeYear = makeYear;
        this.color = color;
        this.maxNoOfPassengers = maxNoOfPassengers;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public LocalDate getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    public void setLicenseExpirationDate(LocalDate licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxNoOfPassengers() {
        return maxNoOfPassengers;
    }

    public void setMaxNoOfPassengers(int maxNoOfPassengers) {
        this.maxNoOfPassengers = maxNoOfPassengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
