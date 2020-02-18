package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bo.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired	
	StudentRepository studentRepo;
	
    @Override
    public Optional<Student> save(Student student) {
        return Optional.of(studentRepo.save(student));
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

	@Override
	public List<Student> findTop() {
		return studentRepo.findTop();
	}

    
}
