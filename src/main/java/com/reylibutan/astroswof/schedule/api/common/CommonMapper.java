package com.reylibutan.astroswof.schedule.api.common;

import java.util.List;

import org.mapstruct.Mapper;

import com.reylibutan.astroswof.schedule.api.dto.EngineerDto;
import com.reylibutan.astroswof.schedule.api.entity.Engineer;

@Mapper(componentModel = "spring")
public interface CommonMapper {

	Engineer engineerDtoToEngineer(EngineerDto from);
	EngineerDto engineerToEngineerDto(Engineer from);
	List<EngineerDto> engineerListToEngineerDtoList(List<Engineer> from);

}
