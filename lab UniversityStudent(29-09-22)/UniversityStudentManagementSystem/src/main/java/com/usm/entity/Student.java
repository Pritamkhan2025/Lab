package com.usm.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString

public class Student {
	
	@Id 		//taking sid as primary key in student
	@GeneratedValue(strategy = GenerationType.AUTO)//id as auto increament
	private int sid;
	
	@Column(length = 20, nullable = false)
	private String sname;
	
	@Column(length = 20, nullable = false)
	private String sdept;
	
	@Column(length = 10, nullable = false)
	private String gender;
	
	@Column(length = 11, nullable = false, unique = true)
	private long sphone;
	
	@Column(length = 25, nullable = false, unique = true)
	private String email;
	
	@Column(length = 30, nullable = false)
	private String address;

}
