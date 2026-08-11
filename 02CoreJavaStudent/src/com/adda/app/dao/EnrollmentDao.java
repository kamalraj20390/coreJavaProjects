package com.adda.app.dao;

import java.util.List;

import com.adda.app.bean.Enrollment;

public interface EnrollmentDao {
	void addEnrollment(Enrollment enrollment);
	List<Enrollment> getAllEnrollment();
	Enrollment getEnrollmentById(int id);
	boolean isAlreadyEnrolled(int studentId,int courseId);
}
