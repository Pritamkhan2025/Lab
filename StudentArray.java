package Array2d;
/*
 * @author pritam khan
 */

public class StudentArray {
		int SNo,SFees;
		String Name,MailId,Address;
		
		StudentArray(int sn,String name,String mailid,String address){//creating constructor
			this.SNo=sn;
			this.Name=name;
			this.MailId=mailid;
			this.Address=address;
		}
		void SFees(int fee) {//method for fees
			if(fee<=2000) {//condition statement
				fee=fee+(10*fee/100);
			}
			this.SFees=fee;
		}
		void display() {//method for print output
			System.out.println("Student No: "+SNo+", Student Name: "+Name+", Student Email: "+MailId+", Student Address: "+Address+", Student Fees: "+SFees);
		}
		
	}

class StudentDetails{
	public static void main(String args[]) {
		StudentArray a[]=new StudentArray[5];//declaring array
		//initialization
		a[0]=new StudentArray(101,"Pritam khan","pritamkhan@gmail.com","kolkata");
		a[1]=new StudentArray(102,"Arnab hoodati","Arnab hoodati@gmail.com","kolkata");
		a[2]=new StudentArray(103,"Sourav Sanfui","Sourav Sanfui@gmail.com","Diamond hourbour");
		a[3]=new StudentArray(104,"Samrat mondal","Samrat mondal@gmail.com","Murshidabad");
		a[4]=new StudentArray(105,"Tanmoy singh","Tanmoy singh@gmail.com","Punjab");
		
		a[0].SFees(2200);
		a[1].SFees(1900);
		a[2].SFees(1600);
		a[3].SFees(2500);
		a[4].SFees(1000);
		
		for(StudentArray i:a) {//for loop to print array i
			i.display();//display method
		}
	}
}
	
	


