package com.cybage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cybage.bean.Department;
import com.cybage.bean.Employee;

@Configuration
public class ConfigurationClass {
	@Bean(name="employee2")
//	@Scope(value="prototype")
	public Employee getEmployee()
	{
		// Setter Injection
//		Employee employee = new Employee();
//		employee.setEmployeeId(101);
//		employee.setName("Chicku");
//		employee.setSalary(50000);
//		return employee;
		
		
		// Construction Injection
		Employee employee=new Employee(101,"kishor",50500);
		return employee;
//		Employee employee1=new Employee(1011,"kisho1r",50500);
//		return employee1;
	}
	
	
	
}
