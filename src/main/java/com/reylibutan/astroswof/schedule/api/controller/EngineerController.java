package com.reylibutan.astroswof.schedule.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reylibutan.astroswof.schedule.api.dto.EngineerDto;
import com.reylibutan.astroswof.schedule.api.service.EngineerService;

/**
 * Basic CRUD operations for {@code Engineer} entity
 * 
 * @author reylibutan@gmail.com
 */
@RequestMapping(value = "/engineers", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class EngineerController {

	private EngineerService engService;

	@Autowired
	public EngineerController(EngineerService engService) {
		super();
		this.engService = engService;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public EngineerDto create(@Valid @RequestBody EngineerDto engDto) {
		return engService.create(engDto);
	}

	@GetMapping
	public List<EngineerDto> getAll() {
		return engService.getAll();
	}

	@GetMapping("/{id}")
	public EngineerDto getAll(@PathVariable Long id) {
		return engService.getById(id);
	}

	// TODO @PutMapping (not a must-have in current requirement scope)
	// TODO @DeleteMapping (not a must-have in current requirement scope)

}
