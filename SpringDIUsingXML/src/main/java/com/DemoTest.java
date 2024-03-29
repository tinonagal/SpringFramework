package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory obj = new XmlBeanFactory(res);
		//Employee e1 = (Employee)obj.getBean("emp1");
		//e1.display();
		//Employee e2 = (Employee)obj.getBean("emp2");
		//e2.display();
		//Employee e5 = (Employee)obj.getBean("emp2");
		//System.out.println(e5);
		//Employee e6 = (Employee)obj.getBean("emp3");
		//System.out.println(e6);
		//Employee e7 = (Employee)obj.getBean("emp4");
		//System.out.println(e7);
		
		Address add1 = (Address)obj.getBean("add");
		System.out.println(add1);
		
		Employee employee1 = (Employee)obj.getBean("employee");
		System.out.println(employee1);
	}

}
