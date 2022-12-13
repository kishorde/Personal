package com.cybage.dao;

import java.util.List;

import com.cybage.model.Product;

public interface ProductDAO {

	int  getProductById(int productId);
	public void addProduct(Product product);		//insert
	List<Product> getAllProduct();			//
	void deleteProduct(int productId);		//delete

}
