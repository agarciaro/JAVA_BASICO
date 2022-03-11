package com.sopra.employee.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sopra.model.error.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@ResponseBody
@Slf4j
public class EmployeeRestErrorHandler {
	
	@ExceptionHandler(value = {HttpMessageNotReadableException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	protected ErrorResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
		ErrorResponse error = new ErrorResponse(1, e.getMessage(), e.toString());
		return error;
	}
	
	@ExceptionHandler(value = {Exception.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	protected ErrorResponse handleAnyOtherException(Exception e) {
		ErrorResponse error = new ErrorResponse(0, e.getMessage(), e.toString());
		return error;
	}
	
}
