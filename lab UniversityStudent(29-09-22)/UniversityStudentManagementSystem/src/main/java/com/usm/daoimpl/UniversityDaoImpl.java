package com.usm.daoimpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.usm.config.HibernateUtil;
import com.usm.dao.UniversityDao;
import com.usm.entity.Student;
import com.usm.entity.University;


public class UniversityDaoImpl implements UniversityDao{
	
	//create object from HibernateUtil
	Session session = HibernateUtil.getSessionFactory().openSession();
	//transaction implementation
	Transaction t = session.beginTransaction();


	//method for addUniversity details
	@SuppressWarnings("deprecation")
	@Override
	public void addUniversity() {
		
		//creating university object and set value
		University u = new University();
		u.setUname("Calcutta University");
		u.setUcity("Kolkata");
		u.setState("West Bengal");
		
		
		//creating student objects and set their values
		Student s = new Student();
		s.setSname("Pritam Khan");
		s.setSdept("Physics");
		s.setGender("Male");
		s.setSphone(62156635);
		s.setEmail("pritam@gmail.com");
		s.setAddress("Daulatabad");
		
		
		Student s1 = new Student();
		s1.setSname("Samrat Mondal");
		s1.setSdept("Physics");
		s1.setGender("Male");
		s1.setSphone(5654865);
		s1.setEmail("samrat@gmail.com");
		s1.setAddress("Murshidabad");
		
		
		Student s2 = new Student();
		s2.setSname("Sagnik samanta");
		s2.setSdept("Comp sci");
		s2.setGender("Male");
		s2.setSphone(64854625);
		s2.setEmail("sagnik@gmail.com");
		s2.setAddress("Malda");
		
		
		Student s3 = new Student();
		s3.setSname("Sayantan Gope");
		s3.setSdept("Math");
		s3.setGender("Male");
		s3.setSphone(99565446);
		s3.setEmail("sayantan@gmail.com");
		s3.setAddress("Thakurpukur");
		
		
		Student s4 = new Student();
		s4.setSname("Sourav sanfui");
		s4.setSdept("Chemistry");
		s4.setGender("Male");
		s4.setSphone(9585225);
		s4.setEmail("sourav@gmail.com");
		s4.setAddress("Behala");
		
		//using arraylist to add all student detais
		List<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		u.setStudent(al);
		
		session.save(u);
		//commit the transaction
		t.commit();
		System.out.println("Data inserted succesfully");
		
	}

	//method for display university details
	@SuppressWarnings("resource")
	@Override
	public void fetchUniversity() {
		
		//creating scanner object  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter university id : ");
		int uid = sc.nextInt();
		
		//identify the university details
		University u = session.get(University.class, uid);
		//using toString() for print value hashcode to String
		System.out.println(u.toString());
		
	}

}
