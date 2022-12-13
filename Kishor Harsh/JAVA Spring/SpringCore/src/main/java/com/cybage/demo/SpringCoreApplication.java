package com.cybage.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybage.bean.Department;
import com.cybage.bean.Employee;
import com.cybage.config.ConfigurationClass;
import com.cybage.config.ConfigurationDeptClass;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringCoreApplication.class, args);
		
		
//		xml based configuration:-
//		-----------------------
		
/*		BeanFactory beanFactory=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee)beanFactory.getBean("employee1");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		*/
		
		
//		Annotation based configuration
//		------------------------------
		// for employee
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Employee employee=(Employee)context.getBean("employee2");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		Employee employee1=(Employee)context.getBean("employee2");
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary());
		
		
		// for department
//		AnnotationConfigApplicationContext contextdept=new AnnotationConfigApplicationContext(ConfigurationDeptClass.class);
//		Department department=(Department)contextdept.getBean("dept");
//		
//		System.out.println(department.getDeptId());
//		System.out.println(department.getDeptName());
//		System.out.println(department.getDeptCode());
		
		context.close();
		
	}

}
