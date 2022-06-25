package com.cogent.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Animal animal = context.getBean(Animal.class);
		animal.drink();
		Hello hello = context.getBean(Hello.class);
		hello.test();
		}

}
