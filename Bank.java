package com;

public class Bank {
	float getRateOfInterest() {
		return 0;
	}	

}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8;
	}
	
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 7;
	}
	
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 9;
	}
	
}
class Interest{
	public static void main(String args[]) {
		SBI s =new SBI();
		ICICI i =new ICICI();
		AXIS a=new AXIS();
		System.out.println("Interest rate of SBI: "+s.getRateOfInterest()+"%");
		System.out.println("Interest rate of ICICI: "+i.getRateOfInterest()+"%");
		System.out.println("Interest rate of AXIS: "+a.getRateOfInterest()+"%");
		
	}
}
