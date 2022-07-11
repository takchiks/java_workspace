package com.cogent.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Resource Not Found Exception");
		// TODO Auto-generated constructor stub
	}

	
	

}
