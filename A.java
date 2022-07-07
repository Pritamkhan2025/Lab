package com;

//multilevel inheritance

public class A {
	void base1() {
		System.out.println("class A");
	}

}
class B extends A{
	void base2() {
		System.out.println("class B");
	}
}
class C extends B{
	void base3() {
		System.out.println("class C");
	}
}
class Test{
	public static void main(String args[]) {
		C obj =new C();			
		obj.base1();
		obj.base2();
		obj.base3();
		
	}
}