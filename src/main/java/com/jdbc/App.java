package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.configuration.JdbcConfiguration;
import com.jdbc.model.Student;
import com.jdbc.service.JdbcCrudOperationImple;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    
    {
    	
    	
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
        
        JdbcCrudOperationImple objectImple= context.getBean("jdbcTemplate", JdbcCrudOperationImple.class);
        
        Student st= new Student();
        
        st.setStudentId(2);
        st.setStudentName("Ankit");
        st.setStudentMarks(1090);
        
        objectImple.insert(st);
    }
}
