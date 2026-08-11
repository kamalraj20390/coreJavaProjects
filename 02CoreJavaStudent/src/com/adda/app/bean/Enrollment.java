package com.adda.app.bean;

public class Enrollment {
	private int id;
	private Student student;
	private Course course;
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrollment(int id, Student student, Course course) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", student=" + student + ", course=" + course + "]";
	}
	
}
