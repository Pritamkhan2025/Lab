package com.example;

import java.util.Scanner;

import com.example.daoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImpl e = new StudentDaoImpl();
        do {
        	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
        	
        	System.out.println("Press:1  Add student details");
        	System.out.println("Press:2  Display student details");
        	
        	int ch=sc.nextInt();
        	System.out.println("-----------------------------");
        	
        	switch(ch) {
        	case 1:
        		e.addStudent();
        		break;
        	case 2:
        		e.fetchStudent();
        		break;
        	}
        	
        }while(true);
    }
}
