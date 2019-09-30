package com.wms.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	LocalDate date;
	
	@Column(nullable = false)
	int quantity;
	
	@Column(nullable = false)
	double price;
	
	@ManyToOne
	Item item;
	
	@ManyToOne
	Person person;
}
