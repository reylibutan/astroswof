package com.reylibutan.astroswof.schedule.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Engineer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 255, nullable = false)
	private String email;

	@Column(length = 255, nullable = false)
	private String firstName;

	@Column(length = 255)
	private String middleName;

	@Column(length = 255, nullable = false)
	private String lastName;

}
