package com.bonvoyage.domain;

import java.io.Serializable;

/*
* Model For Trip 
* @author  John Styves Vallon
* @version 1.0
* @since   2019-11-18 
*
* */


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Trip implements Serializable  {
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer tripId;
	
	@NotEmpty
	private String origin;
	@NotEmpty
	private String destination;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date originDate;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date destinationDate;
	
	@NotNull
	private Double originLat;
	@NotNull
	private Double originLng;
	@NotNull
	private Double destinationLat;
	@NotNull
	private Double destinationLng;

	
	//private List<User> users;
	
	@NotNull
	private Integer numberPeople;
	
	@NotNull
	private Integer fees;
	
	@NotEmpty
	private String PaymentType;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getTripId() {
		return tripId;
	}

	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getOriginDate() {
		return originDate;
	}

	public void setOriginDate(Date originDate) {
		this.originDate = originDate;
	}

	public Date getDestinationDate() {
		return destinationDate;
	}

	public void setDestinationDate(Date destinationDate) {
		this.destinationDate = destinationDate;
	}

	public Double getOriginLat() {
		return originLat;
	}

	public void setOriginLat(Double originLat) {
		this.originLat = originLat;
	}

	public Double getOriginLng() {
		return originLng;
	}

	public void setOriginLng(Double originLng) {
		this.originLng = originLng;
	}

	public Double getDestinationLat() {
		return destinationLat;
	}

	public void setDestinationLat(Double destinationLat) {
		this.destinationLat = destinationLat;
	}

	public Double getDestinationLng() {
		return destinationLng;
	}

	public void setDestinationLng(Double destinationLng) {
		this.destinationLng = destinationLng;
	}

	public Integer getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(Integer numberPeople) {
		this.numberPeople = numberPeople;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public String getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
}
