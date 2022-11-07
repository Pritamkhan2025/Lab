package com.anudip.sms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.sms.entity.Student;
import com.anudip.sms.service.StudentService;

//student controller to handling all rest api incoming request
@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	//save student in db table using rest api PostMapping
	@PostMapping("/saveS")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student){
		return new ResponseEntity<Student>(ss.saveStudent(student), HttpStatus.CREATED);
	}
	
	// fetch student details from db table using rest api GetMapping
	@GetMapping("/getAllS")
	public List<Student> getAll(){
		return ss.getAllStudent();
	}
	
	// fetch student details from db table using rest api GetMapping based on id
	@GetMapping("/getS/{sid}")
	public ResponseEntity<Student> getU(@PathVariable("sid") int sid){
		return new ResponseEntity<Student>(ss.getStudentById(sid),HttpStatus.OK);
	}
	
	//update student details in db table using rest api PutMapping based on id
	@PutMapping("/updateS/{sid}")
	public ResponseEntity<Student> updateStudent(@PathVariable("sid") int uid, @RequestBody Student student){
			return new ResponseEntity<Student>(ss.updateStudentById(student, uid), HttpStatus.OK);
		}
		
		//delete student details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteS/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int uid){
		ss.deleteStudentById(uid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}


}
