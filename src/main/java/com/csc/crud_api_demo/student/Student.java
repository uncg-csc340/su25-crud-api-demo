package com.csc.crud_api_demo.student;

public class Student {
    private Long studentId;
    private String name;
    private String email;
    private String major;
    private double gpa;

    public Student(Long studentId, String name, String email, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long id) {
        this.studentId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }





}
