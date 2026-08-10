package com.adda.app.bean;

public class Course {
	private int id;
	private String courseName;
	private String trainer;
	private double fee;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String courseName, String trainer, double fee) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.trainer = trainer;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", trainer=" + trainer + ", fee=" + fee + "]";
	}
	
}
