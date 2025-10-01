package org.program.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.program.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empRepo")
public class EmpRepoImpl implements EmpRepo {

	@Autowired
	JdbcTemplate template;

	@Override
	public boolean isSave(final Employee employee) {
		int value = template.update("insert into employee(name,email,contact) values(?,?,?)", new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, employee.getName());
				ps.setString(2, employee.getEmail());
				ps.setString(3, employee.getContact());
			}
		});
		return value > 0 ? true : false;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> list= template.query("select *from employee",new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
				Employee emp= new Employee();
				emp.setName(rs.getString(1));
				emp.setEmail(rs.getString(2));
				emp.setContact(rs.getString(3));
				
				return emp;
			}
		});
		return list;
	}

	@Override
	public boolean isDelete(String email) {
		int value= template.update("delete from employee where email=?",new Object[]{email});
		return value>0 ? true: false;
	}

	@Override
	public boolean isUpdate(Employee employee) {
		int value=template.update("update employee set name=?,email=?,contact=?",new Object[]
				{employee.getName(),employee.getEmail(),employee.getContact()});
		return value>0 ? true:false;
	}

}
