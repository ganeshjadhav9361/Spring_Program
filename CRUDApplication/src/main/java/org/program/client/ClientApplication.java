package org.program.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.program.config.DBConfig;
import org.program.model.Employee;
import org.program.service.EmpServiceImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template= (JdbcTemplate)context.getBean("template");
		if(template!=null) {
			System.out.println("Database is Connected");
		}
		else {
			System.out.println("Database is not coonected");
		}
		
		EmpServiceImpl empService= (EmpServiceImpl) context.getBean("empService");
		Employee emp= new Employee();
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			System.out.println("5. exit");
			System.out.println("Enter your choice");
			int choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter name email contact");
				String name= sc.nextLine();
				String email= sc.nextLine();
				String contact= sc.nextLine();
				
				emp.setName(name);
				emp.setEmail(email);
				emp.setContact(contact);
				
				boolean b= empService.isSave(emp);
				if(b) {
					System.out.println("Data save Successfully......");
				}
				else {
					System.out.println("Data not save Successfully......");
				}
				break;
				
			case 2:
				List<Employee> list= empService.getEmployee();
				for(Employee e: list) {
					System.out.println(e.getName()+"\t"+e.getEmail()+"\t"+e.getContact());
				}
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter email for deleted employee");
				email= sc.nextLine();
				
				b= empService.isDelete(email);
				if(b) {
					System.out.println("Data deleted successfully......");
				}
				else {
					System.out.println("Data not deleted");
				}
				break;
				
			case 4:
				System.out.println("Enter name email contact");
				sc.nextLine();
				name=sc.nextLine();
				email=sc.nextLine();
				contact=sc.nextLine();
				
				emp.setName(name);
				emp.setEmail(email);
				emp.setContact(contact);
				
				b= empService.isUpdate(emp);
				
				if(b)
				{
					System.out.println("Updated");
				}
				else {
					System.out.println("not updated");
				}
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
		}while(true);
		
		
		
		
		
		
		
	
	}

}
