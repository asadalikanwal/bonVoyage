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

import javax.persistence.*;
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

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date originDate;

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date destinationDate;

	@NotNull
	private Double originLat;
	@NotNull
	private Double originLng;
	@NotNull
	private Double destinationLat;
	@NotNull
	private Double destinationLng;


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@NotNull
	private Integer numberPeople;

	@NotNull
	private Integer fees;

	@NotEmpty
	private String PaymentType;


	private boolean isFull;

	private String status;


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isFull() {
		return isFull;
	}
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}



	public Integer getTripId() {
		return tripId;
	}
	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}
	public String getorigin() {
		return origin;
	}
	public void setorigin(String origin) {
		this.origin = origin;
	}
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination = destination;
	}
	public Date getoriginDate() {
		return originDate;
	}
	public void setoriginDate(Date originDate) {
		this.originDate = originDate;
	}
	public Date getdestinationDate() {
		return destinationDate;
	}
	public void setdestinationDate(Date destinationDate) {
		this.destinationDate = destinationDate;
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

}