package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
