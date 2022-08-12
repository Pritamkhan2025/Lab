package collection;
/*
 * @pritam khan
 */

import java.util.ArrayList;
import java.util.List;

public class ExtractArray {
	public static void main(String[] args) {
		//creating array list
		List <String> al=new ArrayList <String>();
		//adding object to array list
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		System.out.println("All array list: "+al);//printing array list
		
		List<String> alsub= al.subList(0,3);
		System.out.println("New array list: "+alsub);//printing array list

}
}