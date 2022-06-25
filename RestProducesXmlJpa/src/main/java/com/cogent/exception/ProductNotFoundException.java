package com.cogent.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ProductNotFoundException() {
		super("Product Not Found");
		// TODO Auto-generated constructor stub
	}
	
}
