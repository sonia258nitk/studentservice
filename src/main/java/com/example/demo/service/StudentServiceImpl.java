package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bo.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired	
	StudentRepository studentRepo;
	
    @Override
    public Student save(Student student) {
        return Optional.of(studentRepo.save(student)).get();
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id);
    }
    
	@Override
	public List<Student> findTop() {
		
		List<Student> topSstudents = studentRepo.findAll().stream().filter(
				student -> student.getSubjects().stream().anyMatch(
						subject -> subject.getSubjectName().equalsIgnoreCase("English")
						&& subject.getMark()>75))
				.collect(Collectors.toList());
		
		return topSstudents;
	}

    
}
