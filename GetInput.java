/*
@ Author Pritam Khan
*/

import java.util.Scanner;  
class GetInput{  
	public static void main(String[] args)  
	{  
		Scanner name= new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String str= name.nextLine();             
		System.out.print("Input form user: "+str);             
	}  
} 