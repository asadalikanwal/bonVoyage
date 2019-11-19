package com.bonvoyage.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    @Size(min =9, max = 9, message ="{Size.licenseNo.validation}")
    private String drivingLicenseNo;
    @NotNull
    @DateTimeFormat(pattern= "MM-dd-yyyy")
    private LocalDate drivingExpirationDate;

    private boolean isDriverApproved;
    @DateTimeFormat(pattern= "MM-dd-yyyy")
    private LocalDate driverApprovalDate;

    public Driver(){}

    public Driver(String drivingLicenseNo, LocalDate drivingExpirationDate) {
        this.drivingLicenseNo = drivingLicenseNo;
        this.drivingExpirationDate = drivingExpirationDate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public LocalDate getDrivingExpirationDate() {
        return drivingExpirationDate;
    }

    public void setDrivingExpirationDate(LocalDate drivingExpirationDate) {
        this.drivingExpirationDate = drivingExpirationDate;
    }

    public boolean isDriverApproved() {
        return isDriverApproved;
    }

    public void setDriverApproved(boolean driverApproved) {
        isDriverApproved = driverApproved;
    }

    public LocalDate getDriverApprovalDate() {
        return driverApprovalDate;
    }

    public void setDriverApprovalDate(LocalDate driverApprovalDate) {
        this.driverApprovalDate = driverApprovalDate;
    }
}
