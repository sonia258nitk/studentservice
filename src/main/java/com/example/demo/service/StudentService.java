package com.example.demo.service;

import com.example.demo.bo.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student request);

    List<Student> findAll();

    List<Student> findTop();

	Student findById(int id);
}
