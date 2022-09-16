package com.example.daoImpl;
/*
 * @pritam khan
 */

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.StudentDao;
import com.example.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	//method for add student details
	public void addStudent() {
		@SuppressWarnings("resource")
		//creating scanner class object
		Scanner sc = new Scanner(System.in);
	
		String n,d,e;
		long p;
		
		//taking user input
		System.out.println("Enter name: ");
		n=sc.nextLine();
		System.out.println("Enter Department: ");
		d=sc.nextLine();
		System.out.println("Enter email: ");
		e=sc.nextLine();
		System.out.println("Enter phone: ");
		p=sc.nextLong();
		
		//student class object
		Student s1=new Student();
		//set all values
		s1.setName(n);
		s1.setDept(d);
		s1.setEmail(e);
		s1.setPhone(p);
		
		//create object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction implementation
		Transaction t = session.beginTransaction();
		session.save(s1);
		System.out.println("student details save sucessfully");
		//commit 
		t.commit();
		
	}
	
	//method for display student details
	public void fetchStudent() {
		@SuppressWarnings("resource")
		//creating scanner class object
		Scanner sc = new Scanner(System.in);
		int id;
		//user input
		System.out.println("Enter id: ");
		id=sc.nextInt();
		//create object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		Student s2 = session.get(Student.class, id);
		//fetching the data
		System.out.println(s2.getName()+" "+s2.getDept()+" "+s2.getEmail()+" "+s2.getPhone());
		
	}
	
	
	//method for update student details
	public void updateStudent() {
		@SuppressWarnings("resource")
		//creating scanner class object
		Scanner sc = new Scanner(System.in);
		int id;
		long phone;
		//user input
		System.out.println("Enter id: ");
		id=sc.nextInt();
		//create object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction implementation
		Transaction t = session.beginTransaction();
		Student s3 =session.get(Student.class, id);
		
		System.out.println("Enter phone number: ");
		phone = sc.nextLong();
		//update the given identifier
		s3.setPhone(phone);
		session.update(s3);
		System.out.println("update succesfully");
		//commit
		t.commit();
		
	}
	
	
	//method for delete student details
    public void deleteStudent() {
		
		@SuppressWarnings("resource")
		//creating scanner class object
		Scanner sc = new Scanner(System.in);
		int id;
		//user input
		System.out.println("Enter id: ");
		id=sc.nextInt();
		//create object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction implementation
		Transaction t = session.beginTransaction();
		
		Student s4 =session.get(Student.class, id);
		//remove data
		session.delete(s4);
		System.out.println("deleted succesfully");
		//commit
		t.commit();
		
		
	}

}
