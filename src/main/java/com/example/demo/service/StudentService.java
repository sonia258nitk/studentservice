package com.example.demo.service;

import com.example.demo.bo.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> save(Student request);

    List<Student> findAll();

    List<Student> findTop();
}
