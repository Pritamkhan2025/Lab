package com.usm;

/*
 * @pritam khan
 */

import com.usm.daoimpl.UniversityDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
        UniversityDaoImpl udao = new UniversityDaoImpl();
        
        udao.addUniversity();//call method for addUniversity details
        udao.fetchUniversity();//call method for fetch university details
        
        
    }
}
