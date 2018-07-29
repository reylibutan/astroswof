package com.reylibutan.astroswof.schedule.api.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reylibutan.astroswof.schedule.api.common.CommonMapper;
import com.reylibutan.astroswof.schedule.api.dto.ScheduleDto;
import com.reylibutan.astroswof.schedule.api.repository.ScheduleRepository;

@Service
public class ScheduleService {

	private ScheduleRepository schedRepo;
	private CommonMapper mapper;

	@Autowired
	public ScheduleService(ScheduleRepository schedRepo, CommonMapper mapper) {
		super();
		this.schedRepo = schedRepo;
		this.mapper = mapper;
	}

	@Transactional
	public ScheduleDto create(ScheduleDto schedDto) {
		return null;
	}

}
