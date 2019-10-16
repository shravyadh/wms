package com.wms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wms.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
