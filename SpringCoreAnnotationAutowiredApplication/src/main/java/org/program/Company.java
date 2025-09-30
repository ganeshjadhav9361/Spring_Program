package org.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("c")
public class Company {
	
	@Autowired
	Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	} 
	
	public void show() {
		System.err.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
	}
}
