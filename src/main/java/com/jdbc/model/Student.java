package com.jdbc.model;


public class Student {
	
	private int studentId;
	private String studentName;
	private float studentMarks;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}
	public Student(int studentId, String studentName, float studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
