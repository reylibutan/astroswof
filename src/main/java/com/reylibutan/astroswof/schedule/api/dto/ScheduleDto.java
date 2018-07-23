package com.reylibutan.astroswof.schedule.api.dto;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class ScheduleDto {

	private Long id;

	@NotBlank
	private String name;

	@NotNull
	// TODO create a DateValidator since @DateTimeFormat is only for formatting
	// purposes only
	@DateTimeFormat(iso = ISO.DATE)
	private Date fromDate;

	@DateTimeFormat(iso = ISO.DATE)
	private Date toDate;

}
