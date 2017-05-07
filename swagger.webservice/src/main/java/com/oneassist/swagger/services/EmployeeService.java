package com.oneassist.swagger.services;

import java.util.Random;
import com.oneassist.swagger.models.Employee;

/**
 * 
 * @author Sanjeev Gupta
 *
 */
public class EmployeeService {

	public Employee createEmployee(Employee employee) {
		if (employee != null && employee.getName() != null
				&& employee.getJobProfile() != null && employee.getAge() != 0) {
			employee.setEmployeeId(getRandomNo());
		}
		return employee;
	}

	/**
	 * Generate random number
	 */
	public int getRandomNo() {
		Random rand = new Random();
		return rand.nextInt(50) + 1;
	}
}
