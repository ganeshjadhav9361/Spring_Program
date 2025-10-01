package org.program.repository;

import java.util.List;

import org.program.model.Employee;

public interface EmpRepo {
	
	public boolean isSave(Employee employee);
	public List<Employee> getEmployees();
	public boolean isDelete(String email);
	public boolean isUpdate(Employee employee);
}
