package lab.oct;
/*
 * @pritam khan
 */
public class Customer {
	
	//given variables
	long accountNumber;
	String accountName;
	double accountBalance;
	
	//generating constructor using fields
	public void createAccount(long accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	//method for deposit amount
	public void setAmount(double amount) {
		
		double newBalance;
		newBalance = amount + accountBalance;
		System.out.println("Amount deposit succesfully-   \nold account balance: "+accountBalance+"\nAmount deposit: "+amount);
		this.accountBalance=newBalance;
		System.out.println("After deposit new updated balance: "+accountBalance);
	}
	
	//method for withdraw amount
	public void withDrawAmount(double withDrawAmount) {
		
		double newBal;
		newBal = accountBalance - withDrawAmount;
		System.out.println("Amount withdraw succesfully-   \nold account balance: "+accountBalance+"\nAmount withdraw: "+withDrawAmount);
		this.accountBalance=newBal;
		System.out.println("After withdraw new update balance: "+accountBalance);
	}
	
	//method for show balance
	public void getAmount() {
		
		System.out.println("Hello "+ accountName +" your account balance is "+accountBalance);
	}
	
	
	public static void main(String args[]) {//main method
		
		//creating customer class object and set values
		
		Customer c1=new Customer();
		c1.createAccount(1234, "Mamta", 500);
		c1.setAmount(2000);
		//c1.withDrawAmount();
		c1.getAmount();
	
		System.out.println("----------------------------");
		
		Customer c2=new Customer();
		c2.createAccount(7278465, "Pritam Khan", 1000);
		c2.setAmount(5000);
		c2.withDrawAmount(2000);
		c2.getAmount();
		
	}
	

}
