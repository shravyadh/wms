package com.wms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 30, nullable = false, unique = true, name = "CITY")
	private String city;
	
	@ManyToOne()
	@JoinColumn(name = "COUNTRY_ID")
	Country country;
	
	@Column(length = 45, nullable = false, unique = true, name = "PINCODE")
	private String pincode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
}
