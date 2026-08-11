package com.adda.app.service;

import java.util.List;

import com.adda.app.bean.Enrollment;

public interface EnrollmentService {
	boolean addEnrollment(Enrollment enrollment);
	List<Enrollment> getAllEnrollment();
	Enrollment getEnrollmentById(int id);
	boolean isAlreadyEnrolled(int studentId,int courseId);
}
