package com.springBoot.SimpleKey.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PropertyOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OId;
	private String OPass;
	private String OName;
	private String OEmail;

}
