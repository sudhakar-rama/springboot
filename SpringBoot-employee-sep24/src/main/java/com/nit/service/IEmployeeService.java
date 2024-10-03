package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmployees();

	Employee getEmployee(Long id);

	void deletelEmployee(Long id);

	void saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	List<Employee> searchEmployee(String empName);
}