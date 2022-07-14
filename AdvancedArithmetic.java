package com.innovation.shapes;

import java.util.Scanner;

public interface AdvancedArithmetic {
	int divisor_sum(int n);

}
class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
}
class Complete{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int n=sc.nextInt();
		
		MyCalculator c=new MyCalculator();
		int sum=c.divisor_sum(n);
		System.out.println("sum of the given number: "+sum);
		sc.close();
	}
}