package com.bonvoyage.service;

import com.bonvoyage.domain.Driver;

public interface DriverService {

//    public String verify(Driver driver);

    public void save(Driver driver);
    public Driver findOne(Long id);
    public void setCarId(int id, int carId);
}
