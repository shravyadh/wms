package com.wms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wms.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	@Query("select item from Item item")
	public List<Item> getItems();
}
