package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;

@Component
public class EmployeeRepositoryService implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deletelEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void saveEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public List<Employee> searchEmployee(String empName) {
		return employeeRepository.findByName(empName);
	}

}