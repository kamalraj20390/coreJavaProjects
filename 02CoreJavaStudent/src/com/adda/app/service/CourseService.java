package com.adda.app.service;

import java.util.List;

import com.adda.app.bean.Course;

public interface CourseService {
	boolean addCourse(Course course);
	List<Course> getAllCourses();
	Course getCourseById(int id);
}
