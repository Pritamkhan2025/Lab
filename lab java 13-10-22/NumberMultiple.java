package lab;


/*
 * @pritam khan
 * 
 * given a number n for each integer i in the range of 1-n print one value per line for the following
	 if i is a multiple of 3 and 5 print "good morning"
	if i is a multiple of only 3 print "good"
	if i is multiple of 3 print "morning"
	if i is not a multiple of 3 and 5 then print the value of i
 */


import java.util.Scanner;

public class NumberMultiple {
	
	int n,i;//declare variable
	Scanner sc = new Scanner(System.in);//taking scanner class object
	
	public void numMul(){
		
		System.out.println("Enter range : ");//user input
		n=sc.nextInt();
		
		for(i=1;i<n;i++) {//loop for condition
			
			//condition of given logic
			
			if((i%3 == 0) && (i%5 == 0)) {
				System.out.println("Good Morning");
			}
			else if((i%3 == 0) && (i%5 != 0)) {
				System.out.println("Good");
			}
			else if((i%3 != 0) && (i%5 == 0)) {
				System.out.println("Morning");
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String args[]) {//main method
		
		NumberMultiple nm = new NumberMultiple();//create object
		nm.numMul();//call method
		
		
	}
	
}

