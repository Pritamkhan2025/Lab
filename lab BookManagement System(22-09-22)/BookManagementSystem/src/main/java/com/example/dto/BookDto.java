package com.example.dto;

/*
 * @pritamkhan
 */
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 25, nullable = false)
	@NotNull(message="title size is too long")
	private String title;
	
	@Column(length = 20, nullable = false)
	@NotNull(message="authorname size is too long")
	private String authorname;
	
	@Column(length = 15, nullable = false)
	@NotNull(message="category size is too long")
	private String category;
	
	@Column(nullable = false)
	private double price;

}
