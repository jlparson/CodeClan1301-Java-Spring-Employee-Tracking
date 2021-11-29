package com.codeclan.employeetracker;

import com.codeclan.employeetracker.models.Employee;
import com.codeclan.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jenny = new Employee("Jenny", 35, "jenny@codeclan.com");
		employeeRepository.save(jenny);
	}

}
