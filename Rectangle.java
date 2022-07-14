package com.innovation.shapes;

public class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	void calculateArea() {
		System.out.println(length*breadth);
	}
	
	public int getLength() {		
		return length;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public int getBreadth() {		
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}		

}
class RectangleTest{
	public static void main(String args[]) {
		Rectangle r=new Rectangle(40,20);
		System.out.print("Old Area of Rectangle is:- ");
		r.calculateArea();
		
		r.setLength(30);
		r.setBreadth(30);
		System.out.print("New Area of Rectangle is:- ");
		r.calculateArea();
	}
}

