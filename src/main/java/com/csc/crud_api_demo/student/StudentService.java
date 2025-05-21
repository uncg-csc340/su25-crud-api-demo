package com.csc.crud_api_demo.student;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * StudentService is a service class that handles the business logic for
 * managing students.
 * It provides methods to perform CRUD operations on student data.
 */
@Service
public class StudentService {
  // Simulating a database with a HashMap
  Map<Long, Student> studentDatabase = new HashMap<>();

  // Sample data
  {
    studentDatabase.put(1L, new Student(1L, "John Doe", "jd@uncg.edu", "Computer Science", 3.5));
    studentDatabase.put(2L, new Student(2L, "Jane Smith", "js@uncg.edu", "Mathematics", 3.8));
  }

  /**
   * Method to get all students
   *
   * @return List of all students
   */
  public Object getAllStudents() {
    return studentDatabase.values();
  }

  /**
   * Method to get a student by ID
   *
   * @param studentId The ID of the student to retrieve
   * @return The student with the specified ID
   */
  public Student getStudentById(@PathVariable long studentId) {
    return studentDatabase.get(studentId);
  }

  /**
   * Method to get students by name
   *
   * @param name The name of the student to search for
   * @return List of students with the specified name
   */
  public Object getStudentsByName(String name) {
    return studentDatabase.values().stream()
        .filter(student -> student.getName().toLowerCase().contains(name.toLowerCase()))
        .toList();
  }

  /**
   * Method to get students by major
   *
   * @param major The major to search for
   * @return List of students with the specified major
   */
  public Object getStudentsByMajor(String major) {
    return studentDatabase.values().stream()
        .filter(student -> student.getMajor().toLowerCase().contains(major.toLowerCase()))
        .toList();
  }

  /**
   * Method to add a new student
   *
   * @param student The student to add
   */
  public void addStudent(Student student) {
    studentDatabase.put(student.getStudentId(), student);
  }

  /**
   * Method to update a student
   *
   * @param studentId      The ID of the student to update
   * @param student The updated student information
   */
  public void updateStudent(Long studentId, Student student) {
    if (studentDatabase.containsKey(studentId)) {
      studentDatabase.put(studentId, student);
    }
  }

  /**
   * Method to delete a student
   *
   * @param studentId The ID of the student to delete
   */
  public void deleteStudent(Long studentId) {
    studentDatabase.remove(studentId);
  }

}
