package com.collectionlab;
/*
 * @pritam khan
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CountryMap {
	
	private HashMap<String,String> M1=new HashMap<String,String>();
	
	//method storeCountryCapital
	public HashMap<String,String> storeCountryCapital(String ContryName, String Capital){
		M1.put(ContryName,Capital);
		return M1;
	}
	
	//method retrieveCapital
	public String retrieveCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	//method retrieveCountryName
	public String retrieveCountryName(String capitalName) {
		for(Map.Entry<String,String> m:M1.entrySet()) {
			if(m.getValue().equals(capitalName))
				return m.getKey();
		}
		return M1.get(capitalName);
	}
	
	//method swapKeyValue
	public HashMap<String,String> swapKeyValue(){
		HashMap<String,String> M2=new HashMap<String,String>();
		for(Map.Entry<String,String> m:M1.entrySet()) {
			M2.put(m.getValue(),m.getKey());
		}
		return M2;
	}
	
	//method createArrayList
	public ArrayList<String> createArrayList(){
		ArrayList<String> al=new ArrayList<String>();
		for(Map.Entry<String,String> m:M1.entrySet()) {
			al.add(m.getKey());
		}
		return al;
	}
	
	
	
	public static void main(String args[]) {//main method
		
		CountryMap c=new CountryMap();
		
		c.storeCountryCapital("India","Delhi");
		c.storeCountryCapital("Japan","Tokyo");
		System.out.println(c.retrieveCapital("India"));//print value
		System.out.println(c.retrieveCountryName("Tokyo"));//print value
		
		HashMap<String,String> M2=c.swapKeyValue();
		System.out.println(M2);
		
	}

}
