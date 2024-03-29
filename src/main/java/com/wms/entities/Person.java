package com.wms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Person {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(length = 30,nullable = false,name = "F_NAME")
	private String firstName;
	
	@Column(length = 30,nullable = false,name = "L_NAME")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "ROLE_ID")
	Role role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
