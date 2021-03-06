package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.controller.PersonController;
import com.cogent.model.Person;

@SpringBootApplication
public class SpringCoreBootAmmbiguity21Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreBootAmmbiguity21Application.class, args);
		PersonController personController = (PersonController) ctx.getBean("personController");
		
		personController.addPerson();
		personController.printPerson();
		personController.deleteById();
		personController.printAll();
		personController.update();
		personController.printAll();
		
	}

}
