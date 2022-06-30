/*
*@Author Pritam Khan
*/
//WAP to print leapyear or not


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
	
	int year;
        Scanner sc = new Scanner(System.in);

	//input from user
        System.out.print("Enter the Year:");
        year = sc.nextInt();

	
	if(((year%4 == 0) &&(year%100 != 0)) || (year%400 == 0)){				//logic
		System.out.print(+year +" is a Leap Year:");
	}else{								//output
		System.out.print(+year +" is a Normal Year:");
	}

    }

}