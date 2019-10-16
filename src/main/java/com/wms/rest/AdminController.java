package com.wms.rest;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wms.entities.Country;
import com.wms.entities.Customer;
import com.wms.entities.Item;
import com.wms.entities.Purchase;
import com.wms.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	//Get Mapping
	@GetMapping("/items")
	public List<Item> getItems() 
	{
		return adminService.getItems();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomers(@PathVariable int id)
	{
		System.out.println(id);
		return adminService.getCustomers(id);
	}
	
	@GetMapping("/purchases/{date}")
	public List<Purchase> viewPurchases(@PathVariable("date") String date)
	{
		return adminService.viewPurchases(LocalDateTime.parse(date));
	}
	
	@GetMapping("/countries")
	public List<Country> getCountries()
	{
		return adminService.getCountries();
	}
	
	//post mapping 
	@PostMapping("/AddCustomer")
	public Customer addCustomer(@RequestBody Customer customer) 
	{
		System.out.println(customer);
		return adminService.addCustomer(customer);
	}
	
	@PostMapping("/purchase")
	public Purchase placeOrder(@RequestBody Purchase purchase) {
		return adminService.placeOrder(purchase);
	}
	
	//delete mapping
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		adminService.deleteCustomer(id);
	}
	
	@DeleteMapping("/deleteItem/{id}")
	public void deleteItem(@PathVariable("id") int id) {
		adminService.deleteItem(id);
	}
	
	//put mapping
	@PutMapping("/renewstock")
	public Item addStock(Item stock) {
		return adminService.updateStock(stock);
	}
}
