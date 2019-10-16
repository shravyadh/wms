package com.wms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Merchant {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(nullable = false, length = 30, name = "NAME")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "PERSON_ID")
	Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
