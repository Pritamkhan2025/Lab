/*
*@Author Pritam Khan
*/
//WAP to print factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
	
	int num,i,fact = 1;		//Declaring variable
        Scanner sc = new Scanner(System.in);

	//input from user
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        for(i=1;i<=num;i++){		//logic
	fact = (fact*i);		//store value
	}
	System.out.println("Factoial of the number is  " +fact);		//output
    }

}