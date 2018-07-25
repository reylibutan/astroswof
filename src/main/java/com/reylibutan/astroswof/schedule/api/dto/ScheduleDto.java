package com.reylibutan.astroswof.schedule.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.reylibutan.astroswof.schedule.api.validation.ValidDate;

import lombok.Data;

@Data
public class ScheduleDto {

	private Long id;

	@NotBlank
	private String name;

	@NotNull
	@ValidDate
	private String fromDate;

	@ValidDate
	private String toDate;

}
