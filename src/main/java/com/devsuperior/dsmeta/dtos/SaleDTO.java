package com.devsuperior.dsmeta.dtos;

import java.time.LocalDate;

import com.devsuperior.dsmeta.entities.Sale;

import lombok.Data;

@Data
public class SaleDTO {
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	
	public SaleDTO(Long id, String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
		super();
		this.id = id;
		this.sellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}
	
	public SaleDTO(Sale sale) {
		id = sale.getId();
		sellerName = sale.getSellerName();
		visited = sale.getVisited();
		deals = sale.getDeals();
		amount = sale.getAmount();
		date = sale.getDate();
	}
	
	
}
