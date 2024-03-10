package com.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		// Hibernate API
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("file loaded successfully");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.getTransaction();
		
		//insert query or save employee record
//		Employee emp1 = new Employee();
//		emp1.setId(105);
//		emp1.setName("Kyle");
//		emp1.setSalary(55200);
//		
//		tran.begin();
//			session.save(emp1);
//		tran.commit();
//		System.out.println("Record inserted successfully");
		
		//Delete query
//		Employee emp = session.find(Employee.class, 105);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//			session.delete(emp);
//			tran.commit();
//			System.out.println("Record deleted successfully");
		
		//Update query
//		Employee emp = session.find(Employee.class, 108);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//				emp.setSalary(20000);
//				session.update(emp);
//			tran.commit();
//			System.out.println("Record updated successfully");
		
		//find record based or usind id
//		Employee emp = session.find(Employee.class, 102);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			System.out.println(emp);
		
		//Retrieve more than one record like select query using HQL
		
//		//In DAO Layer
//		TypedQuery qry = session.createQuery("select emp from Employee emp");
//		List<Employee> listOfEmp = qry.getResultList();
//		TypedQuery qry = session.createQuery("from Employee");
//		List<Employee> listOfEmp = qry.getResultList();
//		
//		//View Layer
//		System.out.println("Number of records "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);
//		
		
		//In DAO Layer with where clause
		//Static value
//		TypedQuery qry = session.createQuery("select emp from Employee emp where emp.id=102");     //id condition 
//		TypedQuery qry = session.createQuery("select emp from Employee emp where emp.salary>35000");    //salary condition
		
//		TypedQuery qry = session.createQuery("select emp from Employee emp where emp.salary > :sal");
//		float salary = 44000;   //we can take value through keyboard using scannner
//		qry.setParameter("sal", salary);
//		List<Employee> listOfEmp = qry.getResultList();
//		//View Layer
//		System.out.println("Number of records "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);
		
			//Retrieve only name variable using HQL retrieving partial object
			TypedQuery qry = session.createQuery("select emp.name from Employee emp");
			List<String> names = qry.getResultList();
			Iterator<String> li = names.iterator();
			while(li.hasNext()) {
				String name = li.next();
				System.out.println("name " +name);
			
		}   
			//Retrieve salary variables
//			TypedQuery qry1 = session.createQuery("select emp.salary from Employee emp");
//			List<Float> salary = qry1.getResultList();
//			Iterator<Float> li1 = salary.iterator();
//			while(li1.hasNext()) {
//				float sal = li1.next();
//				System.out.println("Salary " +sal);
			
			//Retrieve name and salary variables
			TypedQuery qry2 = session.createQuery("select emp.name,emp.salary from Employee emp");
			List<Object[]> NameandSal = qry2.getResultList();
			Iterator<Object[]> li2 = NameandSal.iterator();
			while(li2.hasNext()) {
				Object obj[] = li2.next();
				System.out.println("Name " +obj[0]+" Salary is "+obj[1]);
	}

}
}
