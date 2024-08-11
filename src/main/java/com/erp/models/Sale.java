package com.erp.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sale_id")
	private long saleId;
	@Column(nullable = false)
	private LocalDateTime saleDate;
	
	
	public long getSaleId() {
		return saleId;
	}
	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}
	public LocalDateTime getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDateTime saleDate) {
		this.saleDate = saleDate;
	}
	
	
}
