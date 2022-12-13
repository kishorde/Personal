package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDAO;
import com.cybage.dao.ProductDAOImp;
import com.cybage.model.Product;

public class ProductServiceImp implements ProductService{

	
	private ProductDAO productDao= new ProductDAOImp();
	
	@Override
	public Product getProductbyId(int productId) {
		
		return productDao.getProductbyId(productId);
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productDao.getAllProduct();
	}

	@Override
	public void deleteProduct(int productId) {
	
		productDao.deleteProduct(productId);
	}

	
	@Override
	public void updateProduct(int productId, String name, int price) {
		productDao.updateProduct(productId, name, price);
		
	}
	
	

	
	

}
