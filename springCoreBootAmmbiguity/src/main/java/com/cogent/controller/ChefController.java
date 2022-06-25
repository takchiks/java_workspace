package com.cogent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.cogent.service.InternationalChef;

@Controller
public class ChefController {
	
	
	InternationalChef internationalChef;
	
	public ChefController(@Qualifier("italianChef") InternationalChef chef) {
		this.internationalChef=chef;
	}
	
	public void eatFood() {
		System.out.print("We are hungry \n lets eat:\t ");
		internationalChef.someFood();
		
	}
	
	
	

}
