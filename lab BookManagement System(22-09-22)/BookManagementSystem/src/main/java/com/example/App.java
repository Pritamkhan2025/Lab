package com.example;

/*
 * @pritamkhan
 */
import java.util.Scanner;

import com.example.daoimpl.BookDaoImpl;

public class App 
{

	public static void main( String[] args )
    {
		//create BookDaoImpl class object
		BookDaoImpl e = new BookDaoImpl();
        char c;
        
        do {
        	@SuppressWarnings("resource")
        	//create scanner class object
			Scanner sc = new Scanner(System.in);
        	
        	//user input
        	System.out.println("Press:1  Add Book details");
        	System.out.println("Press:2  Display Book details");
        	System.out.println("Press:3  Update Book price");
        	System.out.println("Press:4  Delete Book details");
        	
        	
        	int ch=sc.nextInt();
        	System.out.println("-----------------------------");
        	
        	//using switch to get method
        	switch(ch) {
        	case 1:
        		e.addBook();//calling this method for add student details
        		break;
        	case 2:
        		e.fetchBook();//calling this method for display student details
        		break;
        	case 3:
        		e.updateBook();//calling this method for update student details
        		break;
        	case 4:
        		e.deleteBook();//calling this method for delete student details
        		break;
        	default:System.out.println("Invalid choice!");//for invalid choice
        	}
        	//to continue or not
        	System.out.println("Do you want to continue? Y/N");
        	c = sc.next().charAt(0);
        	//case sensitive validation
        }while(c =='y' || c =='Y');
        System.out.println("------Thank you visit again-------");
         
        
    }
}
