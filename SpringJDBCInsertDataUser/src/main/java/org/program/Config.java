package org.program;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan (basePackages= {"org.program"})

public class Config {
	
	@Bean (name="dataSource")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("MySQL@12345678");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springprogram?sslMode=DISABLED");

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return dataSource;
		
	}
	
	@Bean (name="template")
	
	public JdbcTemplate getTemplate() {
		JdbcTemplate template= new JdbcTemplate();
		template.setDataSource(this.getDataSource());
		return template;
	}
}
