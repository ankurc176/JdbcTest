package com.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	@Override
	public Student retrieve(int studentId) {
		// TODO Auto-generated method stub
		
		String selectUrl = "Select * from studentTable where studentId = ?;";
		RowMapper<Student> student = new  RowMapperImple();
		Student rs = jdbcTemplate.queryForObject(selectUrl, student, studentId);
		
		return rs;
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
		String updateUrl = "update studentTable set studentName=?, studentMarks=? where studentId=?;";
		jdbcTemplate.update(updateUrl, student.getStudentName(),student.getStudentMarks(),student.getStudentId());
		
		System.out.println("Updated Successfully");
	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		
		String deleteUrl = "Delete from studentTable where studentId=?;";
		jdbcTemplate.update(deleteUrl, studentId);
		
		System.out.println("Deleted Successfully");
		
	}

}
