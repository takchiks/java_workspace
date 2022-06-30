package com.cogent.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

	@PreAuthorize("hasRole('Admin')")
	@GetMapping("/register")
	public String registerPage() {
		return "Registration Page";
	}

	@PreAuthorize("hasRole('Admin')")
	@GetMapping("/login")
	public String loginPage() {
		return "Login Page";
	}

}
