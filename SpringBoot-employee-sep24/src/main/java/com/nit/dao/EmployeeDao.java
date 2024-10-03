package com.nit.dao;

import java.util.List;

import com.nit.entity.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	Employee getEmployee(Long id);
	void deleteEmpoloyee(Long id);
	void saveEmpoloyee(Employee emp);
	void updateEmpoloyee(Employee emp);
}