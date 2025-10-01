package org.program;

import java.util.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;


public class ClientApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(config.class);
		
		//DriverManagerDataSource dataSource= (DriverManagerDataSource)context.getBean("dataSource");
		
		JdbcTemplate template= (JdbcTemplate)context.getBean("template");
		
		if(template!=null) {
			System.out.println("Database is connected");
			
			//template.execute("insert into register(name,email,contact) values('mahesh','mahesh@gmail.com','62145296')");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter name email contact");
			String name= sc.nextLine();
			String email= sc.nextLine();
			String contact= sc.nextLine();
			
			template.execute("insert into register(name,email,contact) values('"+name+"','"+email+"','"+contact+"')");
			
			System.out.println("record save successfully......");
		}
		else {
			System.out.println("Database is not connected");
		}
		
		context.close();
	}

}
