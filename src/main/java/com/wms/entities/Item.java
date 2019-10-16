package com.wms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Item {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(nullable = false, length = 20, name = "NAME")
	private String name;
	
	@Column(nullable = false, name = "QUANTITY")
	private int quantity;
	
	@Column(nullable = false, name = "PRICE")
	private double price;
	
	@OneToOne
	@JoinColumn(name = "MERCHANT_ID")
	Merchant merchant;
	
	
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	
	
}
