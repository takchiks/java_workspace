package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.controller.EmployeeController;

@SpringBootApplication
public class SpringBootOneToOneApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootOneToOneApplication.class, args);
		EmployeeController employeeController = (EmployeeController)ctx.getBean("employeeController");
		employeeController.addEmployee();
	}

}
