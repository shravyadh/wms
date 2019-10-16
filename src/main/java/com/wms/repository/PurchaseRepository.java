package com.wms.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.wms.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	
	@Query("select purchase from Purchase purchase where purchase.date = :date")
	public List<Purchase> viewPurchases(@PathVariable("date") LocalDateTime date);
}
