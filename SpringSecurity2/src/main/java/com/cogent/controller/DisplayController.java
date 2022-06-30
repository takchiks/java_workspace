package com.cogent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	@GetMapping(value = "/loginhere")
	public String getHomePage() {
		return "loginpage.html";
	}
	
}
