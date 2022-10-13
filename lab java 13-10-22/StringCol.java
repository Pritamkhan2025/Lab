package lab;

/*
 * @pritam khan
 * 
 * .Given two string of lowercase english store it in a variable of a and b
perform:
calculate sum of length of a and b
check weather a is greater than b lexicographically
capitalize the first letter of a and b and print together
 */

import java.util.Scanner;

public class StringCol {
	
	String a,b;//declare variable
	Scanner sc = new Scanner(System.in);//taking scanner class object
	
	public void lowString() {
		
		//user input
		System.out.println("Enter String1: ");
		a=sc.next();
		System.out.println("Enter String2: ");
		b=sc.next();
		
		//calculate sum of length of a and b
		System.out.println("sum of the length of two string: "+(a.length()+b.length()));
		
		//check weather a is greater than b lexicographically
		if(a.compareTo(b)<0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//capitalize the first letter of a and b and print together
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()+ b.substring(1));
		
	}
	
	public static void main(String args[]) {
		
		StringCol s = new StringCol();//creating class object
		s.lowString();//calling method
	}

}
