package com.springboot.edw.productms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="pid")
	private int productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="retail_price")
	private float retailPrice;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST})
	@JoinColumn(name="manuf_name")
	private Manufacturer manufacturer;
	
	public Product() {
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
