package com.cogent.service;

import java.util.List;

import com.cogent.model.Person;

public interface PersonService {
	public Person getPerson(Long id);
	public void addPerson(Person person);
	public void deletePerson(Long id);
	public void updatePerson(Long id, Person person);
	public List<Person> findAll();
}
