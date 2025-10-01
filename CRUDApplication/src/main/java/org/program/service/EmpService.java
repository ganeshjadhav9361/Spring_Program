package org.program.service;

import java.util.List;

import org.program.model.Employee;

public interface EmpService {
	
	public boolean isSave(Employee employee);
	public List<Employee> getEmployee();
	public boolean isDelete(String email);
	public boolean isUpdate(Employee employee);
}
