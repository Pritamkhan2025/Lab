package collection;
/*
 * @pritam khan
 */
import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {
		//creating array list
				List <String> al=new ArrayList <String>();
				//adding object to first array list
				al.add("Red");
				al.add("Green");
				al.add("Black");
				al.add("White");
				al.add("Pink");
				System.out.println("First array list: "+al);//printing first array list
				
				
				List <String> all=new ArrayList <String>();
				//adding object to second array list
				all.add("Red");
				all.add("Green");
				all.add("Black");
				all.add("Pink");
				System.out.println("Second array list: "+all);//printing second array list
				System.out.println();
				
				boolean b=al.equals(all);
				System.out.println("After compare, value is: "+b);//print boolean value
				

	}

}
