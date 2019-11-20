package com.bonvoyage.repository;

import com.bonvoyage.domain.Driver;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {
//    @Query("update Driver d set d.car_id = :carId where d.id = :id ")
//    public void setCarId(@Param("id") int id, @Param("carId") int carId);
}
