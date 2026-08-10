package com.adda.app.dao;

import java.util.List;

import com.adda.app.bean.Student;

public interface StudentDao {
	void addStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
}
