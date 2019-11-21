package com.bonvoyage.service;

import com.bonvoyage.domain.Driver;
import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;

import java.util.List;

public interface DriverService {

//    public String verify(Driver driver);

    public void save(Driver driver);
    public Driver findOne(Long id);
    public void setCarId(int id, int carId);

    List<Driver> findUsersByRole(Boolean isDriverApproved);
}
