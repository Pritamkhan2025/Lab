package com.example.wrapperclass;

public class Student {
	double fees;
	public double calculteFeesStructure(long studentid,char studentGrade,boolean isScholarshipEligible,double monthlyFees) {
		
		if(studentid!=0 && studentGrade=='A' && isScholarshipEligible==true) {
			return(fees=monthlyFees-(monthlyFees*10/100));
		}
		else if(studentid!=0 && studentGrade=='B' && isScholarshipEligible==true) {
			return(fees=monthlyFees-(monthlyFees*8/100));
		}
		else if(studentid!=0 && studentGrade=='C' && isScholarshipEligible==true) {
			return(fees=monthlyFees-(monthlyFees*6/100));
		}
		else if(studentid!=0 && studentGrade=='D' && isScholarshipEligible==true) {
			return(fees=monthlyFees-(monthlyFees*4/100));
		}
		else {
			System.out.println("Not Eligible for Exception");
		}
		return monthlyFees;
	}
	
	public static void main(String args[]) {
		Student s=new Student();
		System.out.println("% of fees is exempted, the calculated fees is "+s.calculteFeesStructure(234,'C',true,600));
		System.out.println("% of fees is exempted, the calculated fees is "+s.calculteFeesStructure(115,'B',true,909.50));
		System.out.println("% of fees is exempted, the calculated fees is "+s.calculteFeesStructure(980,'G',false,1810));
		
	}
	
}
