package com.reylibutan.astroswof.schedule.api.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reylibutan.astroswof.schedule.api.dto.ScheduleDto;

@RequestMapping("/schedules")
@RestController
public class ScheduleController {

	@PostMapping
	public ScheduleDto create(@Valid @RequestBody ScheduleDto scheduleDto) {
		// TODO implement
		return scheduleDto;
	}

}
