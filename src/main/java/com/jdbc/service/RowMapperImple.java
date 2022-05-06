package com.jdbc.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.model.Student;

public class RowMapperImple implements RowMapper<Student>{
	

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setStudentId(rs.getInt(1));
		st.setStudentName(rs.getString(2));
		st.setStudentMarks(rs.getFloat(3));
		
		return st;
	}
}
