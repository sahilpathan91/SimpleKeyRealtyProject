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

public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BId;
	private String BPass;
	private String BName;
	private String BEmail;

}
