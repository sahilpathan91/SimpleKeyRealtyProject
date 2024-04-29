package com.springBoot.SimpleKey.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Renting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RId;
	private int Rdate;

}
