package com.anudip.sms.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter your firstname")
	private String fname;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter your lastname")
	private String lname;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter your standard you are pursuring")
	private String standard;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "please enter your email id")
	@Email
	private String email;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "please enter your phone number")
	private long phone;

}
