package com.springboot.edw.productms.dao;

import java.util.List;

import com.springboot.edw.productms.entity.ManufacturerProductReport;
import com.springboot.edw.productms.entity.Product;

public interface ProductDetailsDao {

	public Product getProductById(int productId);
	public List<ManufacturerProductReport> getManufacturerReport();
}
