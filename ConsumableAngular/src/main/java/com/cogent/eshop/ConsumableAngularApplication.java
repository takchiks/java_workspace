package com.cogent.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication

@CrossOrigin
public class ConsumableAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumableAngularApplication.class, args);
	}

}
