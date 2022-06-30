package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.User;
import com.cogent.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userSevice;
	
	@PreAuthorize("hasRole('Admin')")
	@GetMapping("/")
	public List<User> getAllUsers(){
		return userSevice.getUsers();
	}

}
