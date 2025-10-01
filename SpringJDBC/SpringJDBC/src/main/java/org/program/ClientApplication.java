package org.program;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ClientApplication {

	public static void main(String[] args) {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setUsername("root");
		dataSource.setPassword("MySQL@12345678");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		if(dataSource!=null) {
			System.out.println("Database is connected");
		}
		else {
			System.out.println("database is not connected");
		}
	}

}
