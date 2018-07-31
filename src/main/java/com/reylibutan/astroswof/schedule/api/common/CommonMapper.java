package com.reylibutan.astroswof.schedule.api.common;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.reylibutan.astroswof.schedule.api.dto.EngineerDto;
import com.reylibutan.astroswof.schedule.api.dto.ScheduleDto;
import com.reylibutan.astroswof.schedule.api.entity.Engineer;
import com.reylibutan.astroswof.schedule.api.entity.Schedule;
import com.reylibutan.astroswof.schedule.api.validation.ValidDateValidator;

@Mapper(componentModel = "spring")
public interface CommonMapper {

	Engineer engineerDtoToEngineer(EngineerDto dto);
	EngineerDto engineerToEngineerDto(Engineer ett);
	List<EngineerDto> engineerListToEngineerDtoList(List<Engineer> from);

	@Mapping(target = "fromDate", source = "dto.fromDate", dateFormat = ValidDateValidator.VALID_DATE_FORMAT)
	@Mapping(target = "toDate", source = "dto.toDate", dateFormat = ValidDateValidator.VALID_DATE_FORMAT)
	Schedule scheduleDtoToSchedule(ScheduleDto dto);
	ScheduleDto scheduleToScheduleDto(Engineer ett);

}
