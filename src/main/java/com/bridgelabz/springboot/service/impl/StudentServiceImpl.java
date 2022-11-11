package com.bridgelabz.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.bridgelabz.springboot.model.Student;
import com.bridgelabz.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		Student s = new Student();
		s.setId(id);
		s.setName("name-" +id);
		s.setMobileNo("7896541231");
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public Student getByName(String name) {
		Student s = new Student();
		s.setId(2);
		s.setName("name-");
		s.setMobileNo("7896541232");
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public boolean save(Student student) {
		System.out.println("id-" +student.getId() + ", name-" +student.getName() + ", mobileNo-" +student.getMobileNo());
		// TODO Auto-generated method stub
		return false;
	}
	
	//http://localhost:8080/student/id?id=1
}
