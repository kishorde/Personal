package com.cybage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cybage.bean.Department;

@Configuration
public class ConfigurationDeptClass {

	@Bean(name="dept")
	public Department getDepartment()
	{
		Department department=new Department();
		department.setDeptId(222);
		department.setDeptName("Computer");
		department.setDeptCode(5001);
		return department;
	}
}
