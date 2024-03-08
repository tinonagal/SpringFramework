package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee)ac.getBean("employee");
		Employee emp2 = (Employee)ac.getBean("employee");
		emp1.setId(102);
		emp1.setName("Jamie");
		emp1.setSalary(45000);
		
		emp2.setId(103);
		emp2.setName("Tim");
		emp2.setSalary(35000);
		
		//System.out.println(emp1);
		//System.out.println(emp2);
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//		String result1 = es.storeEmployee(emp1);
//		String result2 = es.storeEmployee(emp2);
//		System.out.println(result1);
//		System.out.println(result2);
		
		List<Employee> listofEmp = es.getAllEmployee();
		System.out.println("Number of employees "+listofEmp.size());
	}

}
