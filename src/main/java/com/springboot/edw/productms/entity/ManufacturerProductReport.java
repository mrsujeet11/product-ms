package com.springboot.edw.productms.entity;

public class ManufacturerProductReport {

	private String manufacturerName;
	private long noOfProductsOffered;
	private double avgRetailPrice;
	private float minRetailPrice;
	private float maxRetailPrice;
	
	public ManufacturerProductReport() {
		
	}
	
	

	public ManufacturerProductReport(String manufacturerName, long noOfProductsOffered, double avgRetailPrice,
			float minRetailPrice, float maxRetailPrice) {
		this.manufacturerName = manufacturerName;
		this.noOfProductsOffered = noOfProductsOffered;
		this.avgRetailPrice = avgRetailPrice;
		this.minRetailPrice = minRetailPrice;
		this.maxRetailPrice = maxRetailPrice;
	}



	public String getManufacturerName() {
		return manufacturerName;
	}

	public long getNoOfProductsOffered() {
		return noOfProductsOffered;
	}

	public double getAvgRetailPrice() {
		return avgRetailPrice;
	}

	public float getMinRetailPrice() {
		return minRetailPrice;
	}

	public float getMaxRetailPrice() {
		return maxRetailPrice;
	}
	
	
}
