package com.cogent.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerMapper {
	@ExceptionHandler(value = ProductNotFoundException.class )
	public ResponseEntity<ErrorMapping> getError() {
		return new ResponseEntity<ErrorMapping>(new ErrorMapping(406,"Could Not Find", new Date()),HttpStatus.BAD_REQUEST);
	}	
}
