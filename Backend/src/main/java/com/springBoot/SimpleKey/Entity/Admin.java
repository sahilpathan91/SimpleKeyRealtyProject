package com.springBoot.SimpleKey.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AId;
	@NotBlank(message = "Pass feild should not be null")
	private String APass;
	@NotBlank(message = "Name feild should not be null")
	private String AName;
	@Email
	@NotBlank(message = "Email feild should not be null")
	private String AEmail;
	
	
	
	

}
