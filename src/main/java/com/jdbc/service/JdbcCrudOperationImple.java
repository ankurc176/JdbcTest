package com.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jdbc.model.Student;

@Component("jdbcTemplate")
public class JdbcCrudOperationImple implements JdbcCrudOperation{

	@Autowired JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		
		String insert="insert into studentTable (studentId, studentName, studentMarks) values (?, ?, ?);";
		jdbcTemplate.update(insert,student.getStudentId(),student.getStudentName(),student.getStudentMarks());
		
	}

}
