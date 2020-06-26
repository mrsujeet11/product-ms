package com.springboot.edw.productms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.edw.productms.dao.ProductDetailsDao;
import com.springboot.edw.productms.entity.ManufacturerProductReport;
import com.springboot.edw.productms.entity.Product;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	private ProductDetailsDao productDetailsDao;
	
	@Override
	@Transactional
	public Product getProductsbyId(int productId) {
		
		return productDetailsDao.getProductById(productId);
	}

	@Override
	public List<ManufacturerProductReport> getManufProductReport() {

		return productDetailsDao.getManufacturerReport();
	}

}
