package org.program;

public class Company {
	private Employee employee;
	
//	Company(Employee employee){
//		System.out.println("Constructor");
//		this.employee=employee;
//	}
	
	public void setEmployee(Employee employee) {
		this.employee=employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void show() {
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
	}
}
