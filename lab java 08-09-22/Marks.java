package com.example.wrapperclass;

import java.util.Scanner;

public class Marks {
	double English;
	long Maths;
	
	
	public void compareMarks(double English,long Maths) {
		
		if(English>Maths) {//logic
			System.out.println("English mark is higher than Maths");
		}
		else if(Maths>English){
			System.out.println("Maths mark is higher than English");
		}
		else{
			System.out.println("Both Are Equal");
		}
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {		
		Marks m=new Marks();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter English marks: ");
		double English=sc.nextDouble();
		System.out.println("Enter Maths marks: ");
		long Maths=sc.nextLong();
		m.compareMarks(English, Maths);
		
		
	}


}
