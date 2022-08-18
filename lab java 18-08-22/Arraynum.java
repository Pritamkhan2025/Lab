package com.collectionlab;
/*
 * @pritam khan
 */

import java.util.ArrayList;

public class Arraynum {
	//private array list
	private ArrayList<Integer> A1=new ArrayList<Integer>();
	
	//method storeEvenNumbers
	public ArrayList<Integer> storeEvenNumbers(int N) {
		
		A1=new ArrayList<Integer>();
		for(int i=2;i<=N;i++) {
			if(i%2==0) A1.add(i);
		}
		return A1;
	}
//method printEvenNumbers
public ArrayList<Integer> printEvenNumbers(int N) {
		//creating new array list
		ArrayList<Integer> A2=new ArrayList<Integer>();
		for(int j: A1) {
			A2.add(j*2);
			System.out.println(j*2);
			
		}
		return A2;
	}

public static void main(String[]args) {
	
	Arraynum a=new Arraynum();//object created
	a.storeEvenNumbers(20);
	a.printEvenNumbers(0);
	
  }	

}







