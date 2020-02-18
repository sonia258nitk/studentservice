package com.example.demo.bo;

import java.util.List;

public class Student {

    private int id;
    private String fullName;
    private List<Subject> subjects;

    public Student(int id, String fullName, List<Subject> subjects) {
        this.id = id;
        this.fullName = fullName;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
