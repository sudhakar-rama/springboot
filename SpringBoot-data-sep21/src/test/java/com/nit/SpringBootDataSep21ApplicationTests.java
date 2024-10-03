package com.nit;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;

@SpringBootTest
class SpringbootDataSep21ApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	//@Test
	void testGetAllEmployees() {
		List<Employee> emps = employeeRepository.findAll();
		emps.forEach(e -> System.out.println(e));
		Assertions.assertEquals(2, emps.size());
	}

	//@Test
	void testSaveEmployee() {
		Employee emp = new Employee("Rama", "HYD", 25000d);
		emp = employeeRepository.save(emp);
		Assertions.assertNotNull(emp.getId());
		Assertions.assertTrue(emp.getId() > 0);
	}

	//@Test
	void testGetEmployee() {
		Optional<Employee> optEmp = employeeRepository.findById(5L);
		Employee emp = null;
		if (optEmp.isPresent())
			emp = optEmp.get();
		System.out.println(emp);
		Assertions.assertNotNull(emp);
	}

	@Test
	void testUpdateEmployee() {
		Optional<Employee> optEmp = employeeRepository.findById(9L);
		Employee emp = null;
		if (optEmp.isPresent()) {
			emp = optEmp.get();
			emp.setAddress("Sav");
		}
		emp = employeeRepository.save(emp);
		System.out.println(emp);
		Assertions.assertEquals("JNTU", emp.getAddress());
	}
	//@Test
	void testDeleteEmployee() {
		employeeRepository.deleteById(8L);
		System.out.println("Deletion is successful!!");
	}
}