package com.jdbc.Std;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class Student {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		int Id;
		String Name;
		
		//taking user input 
		System.out.println("Enter Student Id: ");
		Id=sc.nextInt();
		System.out.println("Enter Student Name: ");
		Name=sc.next();
		
		try {
			
			Connection conn=Helper.con();//connection
			PreparedStatement sl=conn.prepareStatement("insert into Student values(?,?)");
			sl.setInt(1,Id);
			sl.setString(2, Name);
			sl.execute();//execute the query
			
			conn.close();//close the connection
			System.out.println("student value added succesfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}

			
			

			
			
	
		
	}

}
