package com.bonvoyage.validator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, LocalDate>{

	private long minAge;
	
	@Override
	public void initialize(Age enteredAge) {
		this.minAge = enteredAge.min();
	}

	@Override
	public boolean isValid(LocalDate checkedDate, ConstraintValidatorContext context) {
		// Age is valid only if >= the specified minimum age
		LocalDate today = LocalDate.now();
		return ChronoUnit.YEARS.between(checkedDate, today) >= minAge;
	}

}
