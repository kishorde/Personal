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
		
//		Product product1=productList.stream().filter(product->product.getProductId()==id).findFirst().get();
		Product product1=productList.stream().filter(product->product.getProductId()==id).findFirst().orElse(null);		
		return product1;
		
	}

	public boolean addProduct(Product product) 
	{	
		return productList.add(product);
		
	}

//	public boolean deleteProduct(int id) {
//		
//		Product product= getProductById(id);
//		return productList.remove(product);
//		
//	}

	public Product deleteProduct(int id) 
	{		
		Product product= getProductById(id);
		if (product==null)
			return null;
		productList.remove(product);
		return new Product();
		
	}

	public void updateProduct(Product product) {
		Product product1=getProductById(product.getProductId());
		
		int index=productList.indexOf(product1);
		productList.set(index, product);
	}
	
	public Product getProductByName(String name)
	{
		Product productByName = productList.stream().filter(product->product.getProductName().equals(name)).findFirst().get();
		return productByName;
	}
	
}