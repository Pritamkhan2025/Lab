package com.example;

/*
 * @pritam khan
 */

import java.util.Scanner;

import com.example.daoImpl.StudentDaoImpl;

public class App //main class
{
    public static void main( String[] args )//main method
    {
    	//create StudentDaoImpl class object
        StudentDaoImpl e = new StudentDaoImpl();
        char c;
        
        //using do-while loop
        do {
        	@SuppressWarnings("resource")
        	//create scanner class object
			Scanner sc = new Scanner(System.in);
        	
        	//user input
        	System.out.println("Press:1  Add student details");
        	System.out.println("Press:2  Display student details");
        	System.out.println("Press:3  Update student details");
        	System.out.println("Press:4  Delete student details");
        	System.out.println("Press:5  Add student details");
        	
        	
        	int ch=sc.nextInt();
        	System.out.println("-----------------------------");
        	
        	//using switch to get method
        	switch(ch) {
        	case 1:
        		e.addStudent();//calling this method for add student details
        		break;
        	case 2:
        		e.fetchStudent();//calling this method for display student details
        		break;
        	case 3:
        		e.updateStudent();//calling this method for update student details
        		break;
        	case 4:
        		e.deleteStudent();//calling this method for delete student details
        		break;
        	case 5:
        		System.exit(0);//exit
        		break;
        	default:System.out.println("Invalid choice!");//for invalid choice
        	}
        	//to continue or not
        	System.out.println("Do you want to continue? Y/N");
        	c = sc.next().charAt(0);
        	//case sensitive validation
        }while(c =='y' || c =='Y');
        System.out.println("------Thank you-------");
         
    }
}
