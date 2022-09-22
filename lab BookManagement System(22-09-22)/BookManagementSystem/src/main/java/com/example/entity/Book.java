package com.example.entity;

/*
 * @pritamkhan
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Book_Maven")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 20, nullable = false)
	private String title;
	
	@Column(length = 25, nullable = false)
	private String authorname;
	
	@Column(length = 20, nullable = false)
	private String category;
	
	@Column(nullable = false)
	private double price;


}
