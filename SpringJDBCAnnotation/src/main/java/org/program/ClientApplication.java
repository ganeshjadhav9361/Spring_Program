package org.program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ClientApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(config.class);
		
		DriverManagerDataSource dataSource= (DriverManagerDataSource)context.getBean("dataSource");
		
		if(dataSource!=null) {
			System.out.println("Database is connected");
		}
		else {
			System.out.println("Database is not connected");
		}
	}

}
