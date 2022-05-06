package com.jdbc.service;

import com.jdbc.model.Student;

public interface JdbcCrudOperation {
	
	public void insert (Student student); 
	
	public Student retrieve(int studentId); 
	
	public void update(Student student);
	
	public void delete(int studentId);

}
