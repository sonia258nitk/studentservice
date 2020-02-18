package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.bo.Student;
import com.example.demo.bo.Subject;

@Repository
public class StudentRepository implements BaseRepository<Student> {

	private static List<Student> studentsList;
	
	static {
	 studentsList = new ArrayList<>(
			Arrays.asList(new Student(1, "User 1", Arrays.asList(new Subject(11, "English", 80),
					new Subject(12, "Science", 85))), 
					new Student(2, "User 2", Arrays.asList(new Subject(11, "English", 65),
							new Subject(12, "Science", 80))),
					new Student(3, "User 3", Arrays.asList(new Subject(11, "English", 90),
							new Subject(12, "Science", 60)))));
	
	}
	
    @Override
    public List<Student> findAll() {
        return studentsList;
    }

	@Override
	public List<Student> findTop() {
		/*
		 * List<Student> topSstudents = studentsList.stream() .filter(student ->
		 * student.getSubjects().stream().filter(subject ->
		 * subject.getSubjectName().equalsIgnoreCase("English")).filter(s ->
		 * s.getMark()>75)) .collect(Collectors.toList()));
		 */
		
		return studentsList;
	}

	@Override
	public Student save(Student student) {
		return studentsList.add(student) ? studentsList.get(studentsList.size()-1) : null; 
	}
	

    
}
