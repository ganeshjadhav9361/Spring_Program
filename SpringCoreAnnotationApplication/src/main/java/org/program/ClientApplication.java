package org.program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
		Employee e= (Employee)context.getBean("emp");
		
		e.show();
	}

}
