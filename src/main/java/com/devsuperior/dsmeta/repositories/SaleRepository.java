package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query(nativeQuery = true, value = "Select * from tb_sales where "
			+ " tb_sales.date between :min and :max "
			+ "order by tb_sales.amount desc;")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
