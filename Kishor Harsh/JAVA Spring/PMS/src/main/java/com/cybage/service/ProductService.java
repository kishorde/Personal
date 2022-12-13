package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Product;

@Service
public class ProductService {
	
	List<Product> productList = new ArrayList<>();
	
	public ProductService()
	{
		productList.add(new Product (101,"Pendrive",200));
		productList.add(new Product (102,"Mobile",15000));
		productList.add(new Product (103,"Laptop",50000));
		productList.add(new Product (104,"Headphone",3000));
	}
	
	public List<Product> getAllProduct()
	{
		return productList;
	}
	
	public Product getProductById(int id){
		
		Product product1=productList.stream().filter(product->product.getProductId()==id).findFirst().get();
		return product1;
		
	}

	public void addProduct(Product product) 
	{	
		productList.add(product);
		
	}

	//normal code
	
	public void deleteProduct(int id) {
		
		Product product= getProductById(id);
		productList.remove(product);
		
	}
	

	public void updateProduct(Product product) {
		Product product1=getProductById(product.getProductId());
		
		int index=productList.indexOf(product1);
		productList.set(index, product);
	}
}