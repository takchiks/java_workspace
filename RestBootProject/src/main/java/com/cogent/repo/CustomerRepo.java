package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
