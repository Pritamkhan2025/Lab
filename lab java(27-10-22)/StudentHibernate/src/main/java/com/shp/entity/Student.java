package com.shp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Student_hibernate")
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 20, nullable = false)
	private String sname;


}
