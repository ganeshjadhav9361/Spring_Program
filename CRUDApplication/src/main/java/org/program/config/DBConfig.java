package org.program.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "org.program" })
public class DBConfig {

	@Bean(name = "datasource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();

		datasource.setUsername("root");
		datasource.setPassword("MySQL@12345678");
		//datasource.setUrl("jdbc:mysql://localhost:3306/springprogram");
		datasource.setUrl("jdbc:mysql://localhost:3306/springprogram?useSSL=false&allowPublicKeyRetrieval=true");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return datasource;
	}

	@Bean(name = "template")
	public JdbcTemplate getTemplate() {

		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
		return template;
	}

}
