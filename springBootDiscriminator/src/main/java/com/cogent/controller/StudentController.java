package com.cogent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cogent.model.CurrentStudent;
import com.cogent.model.ExStudent;
import com.cogent.model.Student;
import com.cogent.repo.StudentRepo;
import com.cogent.service.StudentService;
@Controller
public class StudentController {
	
	private StudentService studentService;
	
	

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}



	public void addStudent() {
		
		studentService.addStudent();
		
		
	}
	
	

}
