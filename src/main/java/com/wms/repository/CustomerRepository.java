package com.wms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wms.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("select customer from Customer customer where customer.id = :id")
	public Customer getCustomers(@Param("id") int id);
}
