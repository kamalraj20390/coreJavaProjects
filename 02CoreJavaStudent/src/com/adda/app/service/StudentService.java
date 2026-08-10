package com.adda.app.service;

import java.util.List;

import com.adda.app.bean.Student;

public interface StudentService {
	boolean addStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
}
