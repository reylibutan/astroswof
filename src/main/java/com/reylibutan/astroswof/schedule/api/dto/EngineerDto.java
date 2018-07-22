package com.reylibutan.astroswof.schedule.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EngineerDto {

	private Long id;

	@NotBlank
	@Email
	private String email;

	@NotBlank
	private String firstName;

	// overriding default message here since default message includes max number
	@Size(min = 1, message = "should not be empty")
	private String middleName;

	@NotBlank
	private String lastName;

}
