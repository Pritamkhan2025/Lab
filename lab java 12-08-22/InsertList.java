package linklist;
/*
 * @pritam khan
 */

import java.util.LinkedList;

public class InsertList {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("Sourav");
		al.add("Pritam");
		al.add("Arnab");
		al.add("Pappu");
		System.out.println("All list: "+al);//print list
		System.out.println();//next line
		
		al.addFirst("JAVA");//insert element in first position
		System.out.println("New list: "+al);//printing new list
		System.out.println();
		
		al.set(2,"Adventure");
		System.out.println("Replace list: "+al);//printing replace list
		System.out.println();//next line
		

	}

}
