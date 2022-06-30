package com.cogent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.model.User;
@Service
public interface UserService {
	public List<User> getUsers();
}
