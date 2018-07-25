package com.reylibutan.astroswof.schedule.api.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidDateValidator implements ConstraintValidator<ValidDate, String> {

	protected static final String DATE_FORMAT = "yyyy-MM-dd";

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
		try {
			LocalDate.parse(value, formatter);
			return true;
		} catch (DateTimeParseException dtpe) {
			return false;
		}

	}

}
