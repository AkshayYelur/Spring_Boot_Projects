package com.webservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.model.Student;

@RestController
public class HomeController {

	@GetMapping("/get")
	public String prelogin() {
		System.out.println("first Request");
		return "welcone to cjc";
	}


@GetMapping("/getAll")
public List<Student> getStudent() {
	

	List<Student> list = new ArrayList<Student>();
	
	Student s = new Student();
	
	s.setId(10);
	s.setName("Akshay");
	s.setAddr("Solapur");
	
Student s1 = new Student();
	
	s1.setId(10);
	s1.setName("Shubham");
	s1.setAddr("Nagpur");
	
	
Student s2 = new Student();
	
	s2.setId(10);
	s2.setName("Niraj");
	s2.setAddr("Kolhapur");
	
	list.add(s);
	list.add(s1);
	list.add(s2);
	
	
	
	
	
	return list;
}	
	
}