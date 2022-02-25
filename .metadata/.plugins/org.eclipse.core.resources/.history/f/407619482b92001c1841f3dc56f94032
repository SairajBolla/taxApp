package com.abc.ecom.service;

import java.util.List;

import com.abc.ecom.dao.ProductDao;
import com.abc.ecom.entity.Product;

public class OrderService {
	
	private ProductDao productDao;
	
	public OrderService() {
		productDao = new ProductDao();
	}
	
	public double totalOrderAmount(int productId, int quantity) {
		
		//ProductDao productDao = new ProductDao();
		
		Product product = productDao.fetchProductDetails(productId);
		
		double unitPrice = product.getPrice();
		
		double totalPrice = unitPrice * quantity;
		
		//calculate gst.
		
		double orderAmount = totalPrice + totalPrice * 0.02;
		
		return orderAmount;
		
	}
	
	public void  saveProductDetails(Product product) {
		
		//ProductDao productDao = new ProductDao();
		
		productDao.saveProduct(product);
	}
	
	public void deleteProduct(int productId) {
		
		//ProductDao productDao = new ProductDao();
		
		Product product = productDao.fetchProductDetails(productId);
		
		productDao.deleteProduct(product);
	}
	
	public List<Product> fetchAllProducts() {
		//todo
		return null;		
	}
	
	public List<Product> fetchAllProductsByCategory(String categoryName) {
		//todo
		return null;		
	}		

}
