package com.codeclan.example.employees;

import com.codeclan.example.employees.models.Employee;
import com.codeclan.example.employees.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee ann = new Employee("Ann", 21, 1348, "ann@gmail.com");
		employeeRepository.save(ann);
	}
}
