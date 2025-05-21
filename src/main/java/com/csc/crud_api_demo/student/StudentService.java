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
   * @param id The ID of the student to retrieve
   * @return The student with the specified ID
   */
  public Student getStudentById(@PathVariable long id) {
    return studentDatabase.get(id);
  }

  /**
   * Method to add a new student
   *
   * @param student The student to add
   */
  public void addStudent(Student student) {
    studentDatabase.put(student.getId(), student);
  }

  /**
   * Method to update a student
   *
   * @param id      The ID of the student to update
   * @param student The updated student information
   */
  public void updateStudent(Long id, Student student) {
    if (studentDatabase.containsKey(id)) {
      studentDatabase.put(id, student);
    }
  }

  /**
   * Method to delete a student
   *
   * @param id The ID of the student to delete
   */
  public void deleteStudent(Long id) {
    studentDatabase.remove(id);
  }

}
