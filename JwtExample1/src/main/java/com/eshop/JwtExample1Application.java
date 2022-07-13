package com.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class JwtExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtExample1Application.class, args);
	}

}
