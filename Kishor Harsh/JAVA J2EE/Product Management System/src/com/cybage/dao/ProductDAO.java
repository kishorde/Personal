package com.cybage.dao;

import java.util.List;

import com.cybage.model.Product;

public interface ProductDAO {

	public Product getProductbyId(int productId);
	public void addProduct(Product product) ;
	public List<Product> getAllProduct();
	void deleteProduct(int productId);
	public void updateProduct(int productId, String name, int price);

}
