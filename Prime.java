/*
*@Author Pritam Khan
*/
//WAP to print prime or not

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
	
	int num,i,j=0;		//declaring variable
        Scanner sc = new Scanner(System.in);

	//input from user
        System.out.print("Enter the number:");
        num = sc.nextInt();

        for(i=2;i<num;i++){		//logic
	
	if(num%i ==0){
		j++;
		break;
		
		}
	}
	
	if(j==0){
		System.out.print(+num +" is a prime number:");
	}									//output
	else{
		System.out.print(+num +" is not a prime number:");
	}

    }

}