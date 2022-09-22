package com.example.daoimpl;

/*
 * @pritam khan
 */

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.BookDao;
import com.example.entity.Book;

public class BookDaoImpl implements BookDao{

	@SuppressWarnings("deprecation")
	@Override
	//method for add book details
	public void addBook() {
		
		@SuppressWarnings("resource")
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//declaring variable
		String t,a,c;
		double p;
		
		//taking user input
		System.out.println("Enter Book Title: ");
		t=sc.next();
		System.out.println("Enter Author name: ");
		a=sc.next();
		System.out.println("Enter Book Category: ");
		c=sc.next();
		System.out.println("Enter Book Price: ");
		p=sc.nextDouble();
		
		//book class object
		Book b=new Book();
		//set all values
		b.setTitle(t);
		b.setAuthorname(a);
		b.setCategory(c);
		b.setPrice(p);
		
		//create object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction implementation
		Transaction t1 = session.beginTransaction();
		session.save(b);
		System.out.println("Book details save sucessfully");
		//commit 
		t1.commit();
		
		
	}

	@Override
	//method for display book details
	public void fetchBook() {
		
		//creating scanner object
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		int id;
		
		//taking user input
		System.out.println("Enter id: ");
		id = sc.nextInt();	
		
		//create  object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		//identify the book
		Book b2 = session.get(Book.class, id);	
		//print the book data
		System.out.println("Display Book details");
		System.out.println(b2.getId()+" "+b2.getTitle()+" "+b2.getAuthorname()+" "+b2.getCategory()+" "+b2.getPrice());
		
	}

	@SuppressWarnings("deprecation")
	@Override
	//method for update book details
	public void updateBook() {
		
		//creating scanner object
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		int id;
		
		//taking user input
		System.out.println("Enter id: ");
		id = sc.nextInt();	
		
		//create  object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		
		Transaction t1 = session.beginTransaction();
		
		//identify the book
		Book b3 = session.get(Book.class, id);	
		//print the book data
		System.out.println("Enter new Price: ");
		double price=sc.nextDouble();
		b3.setPrice(price);
		
		//update the data
		session.update(b3);	
		System.out.println("Update Successfully");	
		t1.commit();
		
	}

	@SuppressWarnings("deprecation")
	@Override
	//method for delete book details
	public void deleteBook() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		int id;
		
		//taking user input
		System.out.println("Enter id: ");
		id = sc.nextInt();	
		
		//create  object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		Transaction t1 = session.beginTransaction();
		//identify the book
		Book b4 = session.get(Book.class, id);
		session.delete(b4);
		System.out.println("Delete Successfully");
		t1.commit();
	}

}
