package com.nit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import static com.nit.constant.Constant.*;

import com.nit.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeRowMapper employeeRowMapper;
	
	@Override
	public List<Employee> getAllEmployees() {
		log.info("Entered into getAllEmployees() method...");
		return jdbcTemplate.query(GET_All, employeeRowMapper);
	}

	@Override
	public void deleteEmpoloyee(Long id) {
		jdbcTemplate.update(DELETE,id);
		log.info("employee is successfully deleted...");
	}

	@Override
	public void saveEmpoloyee(Employee emp) {
		jdbcTemplate.update(INSERT,emp.getName(),emp.getAddress(),emp.getSalary());
		log.info("employee is successfully inserted...");
	}

	@Override
	public Employee getEmployee(Long id) {
		log.info("Entered into getEmployee() method...");
		return jdbcTemplate.query(GET_ONE, employeeRowMapper,id).get(0);
	}

	@Override
	public void updateEmpoloyee(Employee emp) {
		jdbcTemplate.update(UPDATE,emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId());
		log.info("employee is successfully updated...");
		
	}

}