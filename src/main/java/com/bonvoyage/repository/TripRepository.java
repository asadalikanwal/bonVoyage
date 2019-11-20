package com.bonvoyage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bonvoyage.domain.Trip;

/*
* Interface Trip, declaration of method to handle trip action
* @author  John Styves Vallon
* @version 1.0
* @since   2019-11-19
*
* */

@Repository
public interface TripRepository extends CrudRepository<Trip, Long>  {
//	@Query("select from Trip limit 10")
//	List<Trip> lastTenTrip();
}
