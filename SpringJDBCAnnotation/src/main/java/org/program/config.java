package org.program;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan (basePackages= {"org.program"})

public class config {
	
	@Bean (name="dataSource")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("MYSQL@12345678");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return dataSource;
		
	}
}
