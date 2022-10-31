package com.shp;

import com.shp.daoimpl.StudentDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImpl sdao = new StudentDaoImpl();
        sdao.addStudent();//call method for add student details
    }
}
