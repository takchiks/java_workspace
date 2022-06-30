package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer> {
	
}
