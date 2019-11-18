package com.bonvoyage.domain;
import java.time.LocalDate;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.bonvoyage.validator.Password;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="User_Id")
private Long id;

@Column(name="First_Name")
@NotEmpty(message="{NotEmpty}")
@Size(min=4,max=50,message="{Size.range}")
private String firstName;

@Column(name="Last_Name")
@NotEmpty(message="{NotEmpty}")
@Size(min=4,max=50)
private String lastName;

@Column(name="Birthdate")
@DateTimeFormat(pattern="MM/DD/YYYY")
@Past(message="{Date.past}") //Create custom validator (?) to make it check for 18 years
private LocalDate birthdate;

@Column(name="Email")
@Email(message="{Email}")
private String email;

@Column(name="Photo")
@NotNull(message="{NotNull}")
private MultipartFile photo; // add MultipartResolver to Dispatcher.java

@Valid
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@Column(name="Phone_Number")
@JoinColumn(name="Phone_Id")
private Phone phoneNo;

@Valid
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@Column(name="Address")
@JoinColumn(name="Address_Id")
private Address address;

@Column(name="Username", nullable = false, unique = true)
@NotNull(message="{NotNull}")
@Size(min=8, max=20,message="{Size.range}")
private String username;

@Column(name="Password", nullable = false)
@NotNull(message="{NotNull}")
@Size(min=8,max=20,message="{Size.range}")
@Password(message="{Password}")
private String password;

@Column(name="Average_Rating")
private long averageRating;

@Column(name="User_Role")
private UserRole userRole;





}