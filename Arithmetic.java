package com;

public class Arithmetic {
	 int  add(int a,int b) {
		return (a+b);
	}

}
class Adder extends Arithmetic{
	public static void main(String args[]) {
		Arithmetic s=new Arithmetic();
		System.out.println("sum: "+s.add(20, 30));
	}
}
