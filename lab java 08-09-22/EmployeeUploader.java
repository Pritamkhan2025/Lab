package com.example.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeUploader {
	int Department_ID, Employee_Id, Employee_Salary, Department_Id;
	String Department_Name, Department_Head, Department_Description, Employee_Name, Employee_Address;
	long Employee_Contact_No;
	double PF;
	
	public void storeDepartmentDetails()  throws SQLException, Exception{
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("Enter Department Id: ");
		Department_ID = sc1.nextInt();
		
		System.out.println("Enter department name: ");
		Department_Name = sc2.nextLine();
		
		System.out.println("Enter department head: ");
		Department_Head = sc3.nextLine();
		
		System.out.println("Enter department description: ");
		Department_Description = sc4.nextLine();
		
		Connection conn = Helper.con();
		PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?,?)");
		
		ResultSet rs = ps.executeQuery("select Department_ID from department where Department_ID = "+Department_ID);
		while(rs.next()) {
			Department_ID=rs.getInt(1);
		}
		if(Department_ID!=Department_ID){
			throw new Exception ("Department does not exists");
		}
		else {
		ps.executeUpdate("insert into department values("+Department_ID+", '"+Department_Name+"', '"+Department_Head+"', '"+Department_Description+"')");
		
		System.out.println("Deprtment details stored ...");
		
		ps.close();
		conn.close();
		rs.close();
		}
	}
	
	//storing employee details
	public void storeEmployeeDetails() throws SQLException,Exception{
		
		Scanner sc5 = new Scanner(System.in);
		Scanner sc6 = new Scanner(System.in);
		Scanner sc7 = new Scanner(System.in);
		Scanner sc8 = new Scanner(System.in);
		Scanner sc9 = new Scanner(System.in);
		Scanner sc10 = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		Employee_Id = sc5.nextInt();
		
		System.out.println("Enter employee name: ");
		Employee_Name = sc6.nextLine();
		
		System.out.println("Enter employee salary: ");
		Employee_Salary = sc7.nextInt();
		
		System.out.println("Enter employee contact no.: ");
		Employee_Contact_No = sc8.nextLong();
		
		System.out.println("Enter employee address: ");
		Employee_Address = sc9.nextLine();
		
		System.out.println("Enter department id: ");
		Department_Id = sc10.nextInt();
		
		Connection conn = Helper.con();
		PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		
		
		ResultSet rs = ps.executeQuery("select Employee_Id, Employee_Name, Employee_Contact_No, Employee_Salary, Employee_Address from employee where Employee_Id="+Employee_Id);
		while(rs.next()) {
			
			Employee_Id = rs.getInt(1);
			Employee_Name = rs.getString(2);
			Employee_Contact_No = rs.getInt(3);
			Employee_Salary = rs.getInt(4);
			Employee_Address = rs.getString(5);
		}
		if((Employee_Id!=Employee_Id) || (Employee_Name!=Employee_Name) || (Employee_Contact_No!=Employee_Contact_No)){
			throw new Exception("Employee already exists");
		}
		if(Employee_Salary<1000) {
			throw new Exception("Salary should not be less than 1000 !!");
		}
		else {
		ps.executeUpdate("insert into employee values("+Employee_Id+", '"+Employee_Name+"', "
		+Employee_Salary+", "+Employee_Contact_No+", '"+Employee_Address+"', "+Department_ID+")");
		System.out.println("Employee details stored...");
		}
		ps.close();
		conn.close();
		rs.close();
	}
		
		public void retrieveEmployeeDetails() throws SQLException{
		
			Scanner sc11 = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			Employee_Id = sc11.nextInt();
		
			Connection conn = Helper.con();
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			
			ResultSet rs = ps.executeQuery("select Employee_Id, Employee_Name, Employee_Contact_No, Employee_Address, Department_Name, Department_Head from employee, department where Employee_Id="+Employee_Id);
			while(rs.next()) {
				Employee_Id = rs.getInt(1);
				Employee_Name = rs.getString(2);
				Employee_Contact_No = rs.getInt(3);
				Employee_Salary = rs.getInt(4);
				Employee_Address = rs.getString(5);
				Department_Name = rs.getString(5);
				Department_Head = rs.getString(6);
			}
			if(Employee_Id==0) {
				System.out.println("Employee ID not present...");
			}else {				
				System.out.println("Employee Id ='"+Employee_Id+"', Employee name ='"+Employee_Name+"', "
						+ "Employee contact no. ='"+Employee_Contact_No+"', Employee address='"+Employee_Address+"', "
						+ "Department name='" +Department_Name+ "', Department head='"+Department_Head+"'");
		
			}
			ps.close();
			conn.close();
			rs.close();
	}
		
		//calculating PF value
		public void calculatePF() throws SQLException{
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			Employee_Id =s.nextInt();
			
			Connection conn = Helper.con();
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?)");
			
			ResultSet rs = ps.executeQuery("select Employee_Id, Employee_Salary from employee where Employee_Id = "+Employee_Id);
			while(rs.next()) {
				Employee_Id=rs.getInt(1);
				Employee_Salary=rs.getInt(2);	
			}
			if(Employee_Id==0) {
				System.out.println("Employee ID not present...");
			}else {				
				if((Employee_Salary>=1000)&&(Employee_Salary<=10000)) {
					PF = Employee_Salary*0.05;
				}
				if((Employee_Salary>=10000)&&(Employee_Salary<=100000)) {
					PF = Employee_Salary*0.06;
				}
				if(Employee_Salary>100000) {
					PF = Employee_Salary*0.07;
				}
				System.out.println("Employee PF amount is: "+PF);
			}
		}

}
