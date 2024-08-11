package com.erp.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sale_items")
public class SaleItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sale_item_id")
	private Long saleItemId;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private BigDecimal unitPrice;
	
	
	public Long getIdSaleItem() {
		return saleItemId;
	}
	public void setIdSaleItem(Long idSaleItem) {
		this.saleItemId = idSaleItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
