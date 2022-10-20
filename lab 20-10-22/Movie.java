package lab.oct;
/*
 * @pritam khan
 */

public class Movie {
	
	//given variables
	String movieName;
	String movieStartTime;
	String movieEndTime;
	double movieTicketPrice;
	
	//generating constructor using fields
	public void addMovie(String movieName, String movieStartTime, String movieEndTime, double movieTicketPrice) {
		
		this.movieName = movieName;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;
	}
	
	//return details using display method
	public String display() {
		return ("Movie name: "+ movieName +"\nMovie start time: "+ movieStartTime +"\nMovie end time: "+ movieEndTime +"\nMovie ticket price: "+ movieTicketPrice+" Rs");
	}
	
	public static void main(String args[]) {
		//creating movie class object 
		Movie m = new Movie();
		m.addMovie("RRR", "1.00 PM", "4.00 PM", 250.55);
		System.out.println(m.display());//printing the values
	}
	

}
