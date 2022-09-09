package com.example.wrapperclass;

import java.util.Scanner;

public class Fees_Infinite {
	double Fees;
	
	public void validateFees(double Fees) {
		
		if(Fees.isInfinite()) {
			System.out.println("Fees is infinite");
		}
		else {
			System.out.println("Fees is not infinite");
		}
	}
	
	public static void main(String args[]) {		
		Fees_Infinite f=new Fees_Infinite();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fees: ");
		double Fees=sc.nextDouble();
		f.validateFees(Fees);
	}	

}
