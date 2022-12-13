package com.cybage.service;

import java.util.List;

import com.cybage.model.Product;

public interface ProductService {

	public Product getProductbyId(int productId);
	public void addProduct(Product product ) ;
	public List<Product> getAllProduct();
	public void deleteProduct(int productId);
	public void updateProduct(int productId, String name, int price);
	
}
