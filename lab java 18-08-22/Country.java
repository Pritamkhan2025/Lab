package com.collectionlab;
/*
 * @pritam khan
 */

import java.util.HashSet;

public class Country {
	
	HashSet<String> H1=new HashSet<>();
	
	//creating method storeCountryNames
	public HashSet<String> storeCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	
	//creating method retrieveCountry
	public String retrieveCountry(String CountryName) {
		for(String s:H1) {
			if(s.contains(CountryName))//condition checking
				return CountryName;
		}
		return null;
	}

	public static void main(String[] args) {//main method

		Country c=new Country();
		
		c.storeCountryNames("India");
		c.storeCountryNames("USA");
		c.storeCountryNames("England");
		c.storeCountryNames("Australia");
		c.storeCountryNames("UAE");
		
		//printing the element is present or null
		System.out.println("India: "+c.retrieveCountry("India"));
		System.out.println("China: "+c.retrieveCountry("China"));
		
	}


}
