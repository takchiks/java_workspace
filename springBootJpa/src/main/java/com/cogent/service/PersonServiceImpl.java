package com.cogent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.model.Person;
import com.cogent.repo.PersonRepo;
@Service
public class PersonServiceImpl implements PersonService {
	private PersonRepo personRepo;
	public PersonServiceImpl(PersonRepo personRepo) {
		// TODO Auto-generated constructor stub
		this.personRepo=personRepo;
	}
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personRepo.save(person);
		

	}

	public  Person getPerson(Long id) {
		return personRepo.findById(id).get();
	}
	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}
	public void updatePerson(Long id, Person person) {
		Person personUpdate = personRepo.findById(id).get();
		personUpdate.setAddress(person.getAddress());
		personUpdate.setName(person.getName());
		personRepo.save(personUpdate);
		
	}
	public List<Person> findAll() {
		
		return personRepo.findAll();
		
	}
	
}
