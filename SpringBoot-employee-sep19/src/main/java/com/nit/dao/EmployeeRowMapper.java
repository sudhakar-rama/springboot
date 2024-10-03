package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.nit.model.Employee;

@Component
public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getLong("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}