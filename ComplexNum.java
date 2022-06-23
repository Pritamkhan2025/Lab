/*
@ Author Pritam Khan
*/


import java.util.Scanner;  

class ComplexNum{  
	public static void main(String[]args)  
	{  
		Scanner num = new Scanner(System.in);

		System.out.println("Enter 1st Real number:");
		int a1Real = num.nextInt();

		System.out.println("Enter 2nd Real number:");
		int a2Real = num.nextInt();

		System.out.println("Enter 1st Imaginary number:");
		int b1Img = num.nextInt();

		System.out.println("Enter 2nd Imaginary number:");
		int b2Img = num.nextInt();

		int sumReal = a1Real + a2Real; //sum of real numbers
		int sumImg = b1Img + b2Img;    //sum of imaginary numbers

		System.out.println("Sum of two complex number is: "+sumReal + "+" + +sumImg + "i");
		

		             
	}  
} 