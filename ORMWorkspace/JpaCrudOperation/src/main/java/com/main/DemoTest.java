package com.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaCrudOperation");
		EntityManager manager = emf.createEntityManager();
		
		EntityTransaction tran = manager.getTransaction();
		
		//Insert Query
//		Employee emp1 = new Employee();
//		emp1.setId(105);
//		emp1.setName("Tomo");
//		emp1.setSalary(39000);
//			tran.begin();
//			manager.persist(emp1);
//			tran.commit();
//			
//			System.out.println("employee record saved successfully");
		
		//Delete Query
//		Employee emp1 = manager.find(Employee.class, 105);
//		if(emp1==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//				manager.remove(emp1);
//			tran.commit();
//			System.out.println("Employee record deleted successfully");
		
		//Update Query
//		Employee emp1 = manager.find(Employee.class, 104);
//		if(emp1==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//			emp1.setSalary(66500);
//				manager.merge(emp1);
//			tran.commit();
//			System.out.println("Employee salary updated successfully");
		
		//Retrieve record using ID
//		Employee emp1 = manager.find(Employee.class, 103);
//		if(emp1==null) {
//			System.out.println("Record not present");
//		}else {
//			System.out.println(emp1);
			
		//Retrieve more than one records using JPQL
		Query qry = manager.createQuery("select emp1 from Employee emp1");
		List<Employee> listOfEmp = qry.getResultList();
			System.out.println(listOfEmp);
		}
		
	}


