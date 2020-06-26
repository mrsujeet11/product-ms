package com.springboot.edw.productms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Category")
public class ProductCategory {
	
	@Id
	@Column(name="pid")
	private int productId;
	
	@Column(name="category_name")
	private String categoryName;
	
	public ProductCategory()
	{
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
