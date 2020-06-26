package com.springboot.edw.productms.service;

import java.util.List;

import com.springboot.edw.productms.entity.ManufacturerProductReport;
import com.springboot.edw.productms.entity.Product;

public interface ProductDetailsService {

	public Product getProductsbyId(int productId);
	public List<ManufacturerProductReport> getManufProductReport();
}
