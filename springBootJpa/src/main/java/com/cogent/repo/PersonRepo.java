package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
