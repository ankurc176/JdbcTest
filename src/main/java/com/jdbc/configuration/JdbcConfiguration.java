package com.jdbc.configuration;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jdbc")
public class JdbcConfiguration {
	
	@Bean("Driver")
	public DataSource DriverManagerData() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbctest");
		ds.setUsername("root");
		ds.setPassword("Chaudhary@18122022");
		
		return ds;
		
	}
	
	@Bean("jdbcTemp")
	public JdbcTemplate JdbcTemplateObject() {
		
		JdbcTemplate jdbc = new JdbcTemplate(); 
		jdbc.setDataSource(DriverManagerData());
		
		return jdbc;
		
	}

}

