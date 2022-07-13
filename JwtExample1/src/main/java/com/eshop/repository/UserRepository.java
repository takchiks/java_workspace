package com.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
