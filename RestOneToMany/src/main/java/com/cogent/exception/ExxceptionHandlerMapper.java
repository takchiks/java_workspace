package com.cogent.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExxceptionHandlerMapper {
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ErrorMapper> getResouceNotFound(){
		
		ErrorMapper error = new ErrorMapper(403, "Not found Boss", new Date());
		return new ResponseEntity<ErrorMapper>(error,HttpStatus.OK);
		
	}
	

}
