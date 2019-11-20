package com.bonvoyage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bonvoyage.domain.Trip;
import com.bonvoyage.repository.TripRepository;
import com.bonvoyage.service.TripService;

/*
 * TripServiceImpl, Implementation of method to handle trip action
 * @author  John Styves Vallon
 * @version 1.0
 * @since   2019-11-19
 *
 * */

@Service
@Transactional
public class TripServiceImpl implements TripService {



	@Autowired
	TripRepository tripRepository;

	@Override
	public void saveTripe(Trip trip) {
		tripRepository.save(trip);
	}

	@Override
	public List<Trip> findTripByOriginAndDest(String origin, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> listTripByLocalisation(String origin, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trip findTripById(Long tripId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> lastTenTrip() {
		//return tripRepository.lastTenTrip();
		return null;
	}

}