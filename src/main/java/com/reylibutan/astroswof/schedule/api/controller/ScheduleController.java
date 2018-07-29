package com.reylibutan.astroswof.schedule.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reylibutan.astroswof.schedule.api.dto.ScheduleDto;
import com.reylibutan.astroswof.schedule.api.service.ScheduleService;

@RequestMapping("/schedules")
@RestController
public class ScheduleController {

	private ScheduleService schedService;

	@Autowired
	public ScheduleController(ScheduleService schedService) {
		this.schedService = schedService;
	}

	@PostMapping
	public ScheduleDto create(@Valid @RequestBody ScheduleDto schedDto) {
		return schedService.create(schedDto);
	}

}
