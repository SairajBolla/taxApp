package com.abc.ecom.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.abc.ecom.entity.Product;
import com.abc.ecom.util.JpaUtil;

public class ProductDao {
	
    private EntityManager entityManager;
	
	public ProductDao() {
		entityManager = JpaUtil.getEntityManager();
	}
	
	
	public Product fetchProductDetails(int productId) {
		
		//EntityManager entityManager = JpaUtil.getEntityManager();
		
		Product product = entityManager.find(Product.class, productId);
		
		return product;
	}
	
	
	public void saveProduct(Product product) {
		
		//EntityManager entityManager = JpaUtil.getEntityManager();
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		entityManager.persist(product);
		
		txn.commit();
	}
	
     public void deleteProduct(Product product) {
		
		//EntityManager entityManager = JpaUtil.getEntityManager();
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		entityManager.remove(product);
		
		txn.commit();
	}
	
	
	
	
}
