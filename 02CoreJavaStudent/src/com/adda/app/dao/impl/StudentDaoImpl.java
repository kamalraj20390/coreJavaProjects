package com.adda.app.dao.impl;

import java.util.List;

import com.adda.app.bean.Student;
import com.adda.app.dao.StudentDao;
import com.adda.app.util.DataStore;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void addStudent(Student student) {
		DataStore.students.add(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return DataStore.students;
	}

	@Override
	public Student getStudentById(int id) {
		for (Student student : DataStore.students) {
			if(id==student.getId())
				return student;
		}
		return null;
	}

}
