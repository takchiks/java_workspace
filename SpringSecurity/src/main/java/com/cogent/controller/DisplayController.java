package com.cogent.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	@GetMapping("/signin")
	public String loginPage() {
		return "redirect:login.html";
	}

}
