package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iid;
	private String productname;
	
}
