package com.innovation.shapes;

import java.util.Scanner;


public class Circle {
	float radius;  
    float pi=3.5f;
    public Circle(){ 
    	radius=1.5f;
    	}
    public Circle(float radius, float pi){
    	this.radius=radius;
    	this.pi=pi;
    	}
    public float calculateArea(float radius) { 
    	return pi*radius*radius;
    	}
    public float calculateCircumference(float radius) { 
   
    	return 2*pi*radius;
    	}
    
    public static void main(String args[]) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the value of radius:- ");
    	float Radius = sc.nextFloat();
    	
    	Circle c = new Circle();
    	System.out.println("Area of circle is:- "+c.calculateArea(Radius));
    	System.out.println("Circumference of circle is:-  "+c.calculateCircumference(Radius));
    	sc.close();
    	
    	}

}
