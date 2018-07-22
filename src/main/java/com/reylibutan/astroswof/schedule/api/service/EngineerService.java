package com.reylibutan.astroswof.schedule.api.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reylibutan.astroswof.schedule.api.common.CommonMapper;
import com.reylibutan.astroswof.schedule.api.dto.EngineerDto;
import com.reylibutan.astroswof.schedule.api.entity.Engineer;
import com.reylibutan.astroswof.schedule.api.repository.EngineerRepository;

@Service
public class EngineerService {

	private EngineerRepository engRepo;
	private CommonMapper mapper;

	@Autowired
	public EngineerService(EngineerRepository engRepo, CommonMapper mapper) {
		super();
		this.engRepo = engRepo;
		this.mapper = mapper;
	}

	@Transactional
	public EngineerDto create(EngineerDto engDto) {
		Engineer engineer = mapper.engineerDtoToEngineer(engDto);
		engRepo.save(engineer);
		engDto.setId(engineer.getId());

		return engDto;
	}

	public List<EngineerDto> getAll() {
		return mapper.engineerListToEngineerDtoList(engRepo.findAll());
	}

	public EngineerDto getById(Long id) {
		Engineer engineer = engRepo.findById(id).orElseThrow(
				() -> new EntityNotFoundException(String.format("Enginer with ID = %s does not exist.", id)));
		return mapper.engineerToEngineerDto(engineer);
	}

}
