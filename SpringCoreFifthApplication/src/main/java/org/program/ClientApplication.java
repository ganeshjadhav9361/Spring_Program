package org.program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("test.xml");
		School s= (School)context.getBean("s");
		
		s.show();

	}

}
