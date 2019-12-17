package com.mphasis.namedjdbc.model;

public class Student {
 
	private int studentRoll;
	private String studentName;
	private int studentClass;
	private String StudentAddress;
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", StudentAddress=" + StudentAddress + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
}
