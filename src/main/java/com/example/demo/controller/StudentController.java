package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value= {"/","/students"})
	public List<Student> getAllStudents() {
		return studentService.findAll();
	}
	
	@GetMapping("/studentsTop")
	public List<Student> getStudentScoredTop() {
		return studentService.findTop();
	}
	
	@PostMapping("/students/{studentId}")
	public Optional<Student> saveStudents(@RequestBody Student student) {
		return studentService.save(student);
	}
}
