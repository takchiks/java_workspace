package com.cogent.service;

import org.springframework.stereotype.Service;

import com.cogent.model.CurrentStudent;
import com.cogent.model.ExStudent;
import com.cogent.model.Student;
import com.cogent.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepo studentRepo;
	
	
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}


	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		Student student = new ExStudent("taku","t@gmail","comp@gma","Cogent");
		studentRepo.save(student);

		student = new ExStudent("peter","pt@gmail","infotech@gma","Infotech");
		studentRepo.save(student);
		

		student = new CurrentStudent("mike","mike@gmail","gb@gma","global");
		studentRepo.save(student);
		student = new CurrentStudent("jason","jason@gmail","uni@gma","Uni");
		studentRepo.save(student);
		
	}
	
	

}
