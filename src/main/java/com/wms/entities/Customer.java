package com.wms.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Customer {
	@Id
	@Column( name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(length = 30, nullable = false, name = "NAME")
	private String name;

	@Column(length = 14, nullable = false,unique=true, name = "PHONE_NUMBER")
	private String phone_number;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_ID")
	Address address;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	User user;

	public Customer() {

	}

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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone_number=" + phone_number + ", address=" + address
				+ ", user=" + user + "]";
	}


}
