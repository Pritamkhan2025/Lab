package lab;
/*
*@pritam khan
*/

public class TaxCalculator {//
	double taxAmount;
	public double calculateTax(String empName,boolean isIndian,double empSal) {
		
		try {//try block
			if(isIndian==false) {//throw indian or not
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}
			else if(empName==""){//throw name value empty or not
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
			if(empSal>100000) {
				return taxAmount=empSal*8/100;
			}
			else if(empSal>=50000 && empSal<100000) {			//logic
				return taxAmount=empSal*6/100;
			}
			else if(empSal>=30000 && empSal<50000) {
				return taxAmount=empSal*5/100;
			}
			else if(empSal>=10000 && empSal<30000) {
				return taxAmount=empSal*4/100;
			}
			else {//throw eligible for given tax or not
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
		}
		catch(Exception e) {//catch block
			System.out.println(e);
		}
		return taxAmount;
	}

}
class CalculatorSimulator{
	public static void main(String []args) {//main method
		TaxCalculator t=new TaxCalculator();
		//method of input and print value
		System.out.println("Ron tax: "+t.calculateTax("Ron", false, 34000));
		System.out.println("Tim tax: "+t.calculateTax("Tim", true, 1000));
		System.out.println("Jack tax: "+t.calculateTax("Tim", true, 55000));
		System.out.println("Null tax: "+t.calculateTax("", true, 30000));
	}
}



@SuppressWarnings("serial")
 class CountryNotValidException extends Exception {

	public CountryNotValidException(String string) {
		// TODO Auto-generated constructor stub
	}

}

@SuppressWarnings("serial")
class EmployeeNameInvalidException extends Exception {

	public EmployeeNameInvalidException(String string) {
		// TODO Auto-generated constructor stub
	}

}


@SuppressWarnings("serial")
 class TaxNotEligibleException extends Exception {

	public TaxNotEligibleException(String string) {
		// TODO Auto-generated constructor stub
	}

}

