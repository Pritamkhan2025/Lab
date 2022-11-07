package com.anudip.sms.service;

import java.util.List;


import com.anudip.sms.entity.Student;



public interface StudentService {
	
	//saving details of student 
		Student saveStudent(Student student);
		
		//getting all details of student 
		List<Student> getAllStudent();
		
		//getting details of student based on uid
		Student getStudentById(int sid);
		
		//getting details of student based on uid & change mentioned details 
		Student updateStudentById(Student student, int sid);
		
		//getting details of student based on uid & delete mentioned user
		void deleteStudentById(int sid);

		List<Student> getFname(String fname);

		List<Student> getLname(String lname);
		
		Student getPhone(long phone);

}
