package com.cybage.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cybage.bean.Employee;

@SpringBootApplication
public class SpringCoreUsingSpringBootApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context= SpringApplication.run(SpringCoreUsingSpringBootApplication.class, args);
		
		Employee employee = context.getBean(Employee.class);
		employee.setName("john");
		employee.setEmployeeId(101);
		employee.setSalary(1000);
		System.out.println(employee);
	}

}
