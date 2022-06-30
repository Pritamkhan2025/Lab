/*
*@Author Pritam Khan
*/
//WAP to draw the pyramid pattern

import java.util.Scanner;

public class PyramidPattern{
    
    public static void main(String[]args){

        int i,j,n;	//Declaring variable
	Scanner sc = new Scanner(System.in);

	//input from user
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for (i=0; i<n; i++)		//outer loop for rows
        {
 
            for (j=n-i; j>1; j--)		//inner loop for spaces
            {
                System.out.print(" ");		//print spaces
            }
  
            for (j=0; j<=i; j++ )		//inner loop for coloum
            {
                System.out.print("* ");
            }
  
            System.out.println();		//print pattern
        }
    }     
    
}