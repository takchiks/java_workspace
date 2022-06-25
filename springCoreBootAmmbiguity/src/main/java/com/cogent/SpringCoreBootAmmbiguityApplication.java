package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.controller.ChefController;

@SpringBootApplication
public class SpringCoreBootAmmbiguityApplication {

	public static void main(String[] args) {
		ApplicationContext contxt =  SpringApplication.run(SpringCoreBootAmmbiguityApplication.class, args);
		ChefController controller = (ChefController)contxt.getBean("chefController");
		controller.eatFood();
	}

}
