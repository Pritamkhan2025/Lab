package com.usm.entity;

/*
 * @pritam khan
 */

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class University {
	
	@Id//uid as primary ke in University
	@GeneratedValue(strategy = GenerationType.AUTO)//uid as auto increament
	private int uid;
	
	@Column(length = 20, nullable = false)
	private String uname;
	
	@Column(length = 20, nullable = false)
	private String ucity;
	
	@Column(length = 20, nullable = false)
	private String state;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "uid")
	private List<Student> student;

}
