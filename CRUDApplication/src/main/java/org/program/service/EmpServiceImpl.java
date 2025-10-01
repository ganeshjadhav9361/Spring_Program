package org.program.service;

import java.util.List;

import org.program.model.Employee;
import org.program.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired EmpRepo empRepo;
	@Override
	public boolean isSave(Employee employee) {
		
		return empRepo.isSave(employee);
	}
	@Override
	public List<Employee> getEmployee() {
		
		return empRepo.getEmployees();
	}
	@Override
	public boolean isDelete(String email) {
		
		return empRepo.isDelete(email);
	}
	@Override
	public boolean isUpdate(Employee employee) {
		
		return empRepo.isUpdate(employee);
	}
	
	
}
