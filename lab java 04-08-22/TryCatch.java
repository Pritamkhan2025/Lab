package exceptionhand;

/*
 * @pritam khan
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {//class
	
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of x: ");//user input of x
			int x=sc.nextInt();
			System.out.println("Enter the value of y: ");//user input of y
			int y=sc.nextInt();
			System.out.println("sample output: "+x/y);//print the output
			sc.close();
		}
		catch(InputMismatchException e) {//catch block for if given input is wrong
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
