package com.springboot.edw.productms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.edw.productms.entity.ManufacturerProductReport;
import com.springboot.edw.productms.entity.Product;

@Repository
public class ProductDetailsDaoImpl implements ProductDetailsDao {
	
	@Autowired
	private EntityManager manager;
	
	private final String MANUF_PRODUCT_QUERY = "SELECT new com.springboot.edw.productms.entity.ManufacturerProductReport"
			+ "( m.manufacturerName, COUNT(p.productId), AVG(p.retailPrice), MIN(p.retailPrice), "
			+ "MAX(p.retailPrice)) "
			+ "from Manufacturer m "
			+ "Left OUTER JOIN Product p on (p.manufacturer = m.manufacturerName) "
			+ "GROUP BY m.manufacturerName "
			+ "ORDER by AVG(p.retailPrice) DESC";
	
	@Override
	public Product getProductById(int productId) {

		Session session = manager.unwrap(Session.class);
		
		Product product = session.get(Product.class, productId);
		return product;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManufacturerProductReport> getManufacturerReport() {

		Session session = manager.unwrap(Session.class);
		TypedQuery<ManufacturerProductReport> query = session.createQuery(MANUF_PRODUCT_QUERY, ManufacturerProductReport.class);
		List<ManufacturerProductReport> report = query.getResultList();
		return report;
	}

}
