package com.adda.app.service.impl;

import java.util.List;

import com.adda.app.bean.Student;
import com.adda.app.dao.StudentDao;
import com.adda.app.dao.impl.StudentDaoImpl;
import com.adda.app.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao=new StudentDaoImpl();
	@Override
	public boolean addStudent(Student student) {
		if(student==null)
		return false;
		if(studentDao.getStudentById(student.getId())!=null)
			return false;
		studentDao.addStudent(student);
		return true;
		
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
