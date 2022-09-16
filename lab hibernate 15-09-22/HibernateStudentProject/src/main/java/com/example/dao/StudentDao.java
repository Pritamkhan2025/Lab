package com.example.dao;
/*
 * @pritam khan
 */

public interface StudentDao {
	public void addStudent(); //save new student in db
	public void fetchStudent();//fetch existing student data
	public void updateStudent();//change existing student data
	public void deleteStudent();//remove existing student data 

}
