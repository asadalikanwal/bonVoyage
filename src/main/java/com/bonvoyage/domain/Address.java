package com.bonvoyage.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Address_Id")
	private Long id;
	
	@Column(name="Door")
	private String door;
	
	@Column(name="Street")
	@NotEmpty(message="{NotEmpty}")
	@Size(min=4, max=20,message="{Size.range}")
	private String street;
	
	@Column(name="City")
	@NotEmpty(message="{NotEmpty}")
	@Size(min=4, max=20,message="{Size.range}")
	private String city;
	
	@Column(name="State")
	@NotEmpty(message="{NotEmpty}")
	@Size(min=2,max=2,message="{Size.exact}")
	private String state;
	
	@Valid
	@Column(name="Zip_Code")
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ZipCode_Id")
	private String zipCode;
}
