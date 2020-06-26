package com.springboot.edw.productms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="manufacturer")
public class Manufacturer {

	@Id
	@Column(name="name")
	private String manufacturerName;
	
	@Column(name="max_discount")
	private float maxDiscount;
	
	@OneToMany(mappedBy="manufacturer",
				cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Product> products;

	public Manufacturer() {
		
	}
	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public float getMaxDiscount() {
		return maxDiscount;
	}

	public void setMaxDiscount(float maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
	@JsonIgnore
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
