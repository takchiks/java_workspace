package com.cogent.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cogent.springconfig")
public class SpringConfig {
	@Bean
	public Hello hello(){
		
		Hello hello = new Hello();
		return hello;
		
	}

}
