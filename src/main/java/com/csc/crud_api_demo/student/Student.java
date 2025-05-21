package com.csc.crud_api_demo.student;

public class Student {
    private Long id;
    private String name;
    private String email;
    private String major;
    private double gpa;

    public Student(Long id, String name, String email, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
