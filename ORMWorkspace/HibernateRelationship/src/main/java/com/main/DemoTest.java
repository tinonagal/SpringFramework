package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;
import com.bean.Trainer;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
	
		//Store Trainer details
		Trainer t1 = new Trainer();
		t1.setTid(1);
		t1.setTname("John");
		t1.setTech("Java");
		
		//Store Student details
//		Student s1 = new Student();
//		s1.setSid(100);
//		s1.setSname("Milly");
//		s1.setAge(23);
//		s1.setTsid(1);       //FK in Trainer
//		
//		Student s2 = new Student();
//		s2.setSid(101);
//		s2.setSname("Jaime");
//		s2.setAge(21);
//		s2.setTsid(1);
//		
//		Student s3 = new Student();
//		s3.setSid(102);
//		s3.setSname("John");
//		s3.setAge(22);
//		
//		//storing Student and Trainer record
//		Trainer t2 = new Trainer();
//		t2.setTid(2);
//		t2.setTname("Jimmy");
//		t2.setTech("Springboot");
		
		Trainer t4 = new Trainer();
		t4.setTid(4);
		t4.setTname("Brody");
		t4.setTech("CSharp");
		
//		Student s4 = new Student();
//		s4.setSid(104);
//		s4.setSname("Sean");
//		s4.setAge(25);
//		s4.setTsid(2);
//		
//		Student s5 = new Student();
//		s5.setSid(105);
//		s5.setSname("Ben");
//		s5.setAge(24);
//		s5.setTsid(2);
		
//		Student s6 = new Student();
//		s6.setSid(106);
//		s6.setSname("Kye");
//		s6.setAge(25);
//		s6.setTsid(4);
//		
//		Student s7 = new Student();
//		s7.setSid(107);
//		s7.setSname("Keith");
//		s7.setAge(24);
//		s7.setTsid(4);
//		
//		List<Student> listOfStd = new ArrayList<>();
//		listOfStd.add(s6);
//		listOfStd.add(s7);
//		
//		t4.setListOfStd(listOfStd);
//		
//			tran.begin();
////				session.save(t1);
////				session.save(s1);
////				session.save(s2);
////			    session.save(s3);
//			    session.save(t4);
////			    session.save(s4);
////			    session.save(s5);
//			tran.commit();
//			System.out.println("Stored trainer and student details");
//	
		
		//HQL Join
//		TypedQuery query = session.createQuery("select t.tech,t.tname,s.sname from Student s, Trainer t where t.tid=s.tsid");
//		List<Object[]> list = query.getResultList();
//		Iterator<Object[]> li = list.iterator();
//		while(li.hasNext()) {
//			Object obj[]=li.next();
//			System.out.println("Tech "+obj[0]+" Traner Name "+obj[1]+" Student Name "+obj[2]);
//		}
		
		//W/o Join also we can get Student from trainer entity
		TypedQuery qry = session.createQuery("select t from Trainer t");
		List<Trainer> trainers = qry.getResultList();
		Iterator<Trainer> li = trainers.iterator();
		while(li.hasNext()) {
			Trainer t = li.next();
			System.out.println(t);
		}
	}

}
