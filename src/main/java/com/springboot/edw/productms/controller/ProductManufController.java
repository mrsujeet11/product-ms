package com.springboot.edw.productms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.edw.productms.entity.ManufacturerProductReport;
import com.springboot.edw.productms.entity.Product;
import com.springboot.edw.productms.service.ProductDetailsService;

@RestController
@RequestMapping("/edw")
public class ProductManufController {

	@Autowired
	private ProductDetailsService productDetailsService;
	
	@GetMapping("/products/{productid}")
	public Product getProductDetails(@PathVariable int productid)
	{
		
		return productDetailsService.getProductsbyId(productid);
	}
	
	@GetMapping("/manufacturers")
	public List<ManufacturerProductReport> getManufacturerReport()
	{
		return productDetailsService.getManufProductReport();
	}
}
