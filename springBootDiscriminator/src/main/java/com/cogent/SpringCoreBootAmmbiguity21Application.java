package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.controller.StudentController;

@SpringBootApplication
public class SpringCoreBootAmmbiguity21Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringCoreBootAmmbiguity21Application.class, args);
		StudentController studentController = (StudentController) ctx.getBean("studentController");
		studentController.addStudent();
	}

}
