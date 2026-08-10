package com.adda.app.bean;

public class Student {
	private Integer stdId;
	private String stdName;
	private String stdEmail;
	public Student() {
	}
	public Student(Integer stdId, String stdName, String stdEmail) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + "]";
	}
	
	
}
