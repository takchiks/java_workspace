package com.cogent.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.cogent.model.Person;
import com.cogent.service.PersonService;
@Controller
public class PersonController {
	
	private PersonService personService;
	
	
	
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}



	public void addPerson() {
		Person person = new Person();
		person.setAddress("1111 Windy Hill Road");
		person.setName("Peter");
		
		personService.addPerson(person);
		person = new Person();
		person.setAddress("0234 NC Road");
		person.setName("Susan");
		
		personService.addPerson(person);
		
	}
	public void printPerson() {
		Long id = 2l;
		Person person = personService.getPerson(id);
		System.out.println(person);
	}
	public void printAll() {
		System.out.println(personService.findAll());
	}
	public void deleteById() {
		personService.deletePerson(7l);
	}
	public void update() {

		Person person = new Person();
		person.setAddress("0234 Raleigh Street");
		person.setName("Peter");
		Long id  = 9l;
		personService.updatePerson(id, person);
		
	}

}
