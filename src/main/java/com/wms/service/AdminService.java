package com.wms.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.entities.Country;
import com.wms.entities.Customer;
import com.wms.entities.Item;
import com.wms.entities.Purchase;
import com.wms.repository.CountryRepository;
import com.wms.repository.CustomerRepository;
import com.wms.repository.ItemRepository;
import com.wms.repository.PurchaseRepository;

@Service
public class AdminService {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	PurchaseRepository purchaseRepository;
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Item> getItems()
	{
		return itemRepository.getItems();
	}
	
	public Customer getCustomers(int id)
	{
		Customer customer = customerRepository.getCustomers(id);
		System.out.println(customer.toString());
		return customer;
	}
	
	public List<Purchase> viewPurchases(LocalDateTime date)
	{
		return purchaseRepository.viewPurchases(date);
	}
	
	public List<Country> getCountries()
	{
		return countryRepository.findAll();
	}
	
	public Customer addCustomer(Customer customer)
	{
		return customerRepository.saveAndFlush(customer);
	}
	
	public Purchase placeOrder(Purchase purchase)
	{
		return purchaseRepository.save(purchase);
	}
	
	public void deleteCustomer(int id)
	{
		customerRepository.deleteById(id); ; 
	}
	
	public void deleteItem(int id)
	{
		itemRepository.deleteById(id); ; 
	}
	
	public Item updateStock(Item stock)
	{
		return itemRepository.save(stock);
	}
}
