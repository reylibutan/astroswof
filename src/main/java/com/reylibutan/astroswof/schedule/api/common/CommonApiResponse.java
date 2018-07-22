package com.reylibutan.astroswof.schedule.api.common;

import lombok.Data;

@Data
public class CommonApiResponse {

	private final String status;
	private final Integer code;
	private final String message;
	private final Object data;

}
