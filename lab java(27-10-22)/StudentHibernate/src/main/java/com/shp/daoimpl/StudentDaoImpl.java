package com.shp.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shp.config.HibernateUtil;
import com.shp.dao.StudentDao;
import com.shp.entity.Student;


public class StudentDaoImpl implements StudentDao{

	@Override
	public void addStudent() {
		
		//taking scanner class for user input
		Scanner sc = new Scanner(System.in);
		
		//create object from hibernate util
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction implementation
		Transaction t = session.beginTransaction();
		
		//taking variable
		String n;
		int i;
		
		System.out.println("Enter id: ");
		i = sc.nextInt();
		
		System.out.println("Enter name: ");
		n = sc.next();
		
		//creating the student object 
		Student s=new Student();
		s.setSid(i);
		s.setSname(n);
		
		session.save(s);
		t.commit();//commit the transaction
		System.out.println("Student details save succesfully");
		sc.close();//closing the scanner class
		
	}

}
