package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.EmployeeDao;
import com.nit.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService  implements IEmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	public Employee getEmployee(Long id){
		return employeeDao.getEmployee(id);
	}
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deletelEmployee(Long id){
		employeeDao.deleteEmpoloyee(id);
	}

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) {
		employeeDao.saveEmpoloyee(emp);
		log.info("Employee is saved successfully..");
	}

	public void updateEmployee(Employee emp) {
		employeeDao.updateEmpoloyee(emp);
		log.info("Employee is updated successfully..");
		
	}

	@Override
	public List<Employee> searchEmployee(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}