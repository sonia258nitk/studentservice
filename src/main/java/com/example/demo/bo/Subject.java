package com.example.demo.bo;

public class Subject {

    private int id;
    private String subjectName;
    private int mark;

    public Subject(int id, String subjectName, int mark) {
        this.id = id;
        this.subjectName = subjectName;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
