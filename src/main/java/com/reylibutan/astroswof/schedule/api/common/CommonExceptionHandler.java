package com.reylibutan.astroswof.schedule.api.common;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public CommonApiResponse test(MethodArgumentNotValidException manve, WebRequest request) {
		return new CommonApiResponse(HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(),
				getFirstErrorMessage(manve), null);
	}

	@ExceptionHandler(value = EntityNotFoundException.class)
	public CommonApiResponse test(EntityNotFoundException enfe, WebRequest request) {
		return new CommonApiResponse(HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND.value(),
				enfe.getMessage(), null);
	}

	private String getFirstErrorMessage(MethodArgumentNotValidException manve) {
		String result = null;

		BindingResult br = manve.getBindingResult();
		if (br != null) {
			List<ObjectError> errors = br.getAllErrors();
			if (!CollectionUtils.isEmpty(errors)) {
				ObjectError error = errors.get(0);
				if (error instanceof FieldError) {
					FieldError fieldError = (FieldError) error;
					result = fieldError.getField() + " " + fieldError.getDefaultMessage();
				}
			}
		}

		return result;
	}
}
