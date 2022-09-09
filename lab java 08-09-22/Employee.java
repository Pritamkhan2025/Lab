package com.example.department;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		try {
			EmployeeUploader e = new EmployeeUploader();
			
			// to select what operation to be done from user
				while(true) {
					Scanner scan = new Scanner(System.in);
					System.out.println("1. Store Department Details");
					System.out.println("2. Store Employee Details");
					System.out.println("3. Retrieve Employee Details");
					System.out.println("4. Calculate PF");
					System.out.println("5. Exit");
					System.out.print("Enter your choice 1-5 \n");
					// read the user input
					int ch = scan.nextInt();
					// switch case
					switch(ch) {
					
					case 1: 
						e.storeDepartmentDetails();
						break;
						
					case 2:
						e.storeEmployeeDetails();
						break;
							
					case 3:
						e.retrieveEmployeeDetails();
						break;
						
					case 4:
						e.calculatePF();
						break;
						
					// 5. Exit	
					case 5:
						System.out.println("Good Luck !");
						scan.close();
						break;
						
					default:
						System.out.println("Retry..");
						break;
					}
					if(ch==5) {
						break;
					}
				}
		}catch(Exception e) {
			System.out.println(e);
		}

		}

}
