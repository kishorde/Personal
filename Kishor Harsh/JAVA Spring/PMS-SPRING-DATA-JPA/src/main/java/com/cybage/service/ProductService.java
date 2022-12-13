package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cybage.model.Product;
import com.cybage.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) 
	{
		return productRepository.save(product);
	}
	
	
//	public List<Product> getAllProduct()
//	{
//		return productRepository.findAll();
//	}
	
	public List<Product> getAllProduct()
	{
		
		// for Returning 0 to 5 entries
//		Pageable pageable = PageRequest.of(0, 5);
//		return productRepository.findAll(pageable).toList();
		
		// for returning list in descending order of productId
		return productRepository.findAll(Sort.by(Direction.DESC,"productId"));
	}
	
	public Product getProductById(int id)
	{
		return productRepository.findById(id).orElse(null);
	}


	public void deleteProduct(int id) {
		
		productRepository.deleteById(id);
	}
	
	public Product updateProduct(int id,Product product)
	{
		Product product1=productRepository.findById(id).get();
		if(product.getProductName()!=null)
			product1.setProductName(product.getProductName());
		if(product.getProductPrice()!=0)
			product1.setProductPrice(product.getProductPrice());
		return productRepository.save(product1);
	}
	
	public List<Product> getProductByName(String name)
	{
//		return productRepository.findByProductName(name);
		
		// getByName is made using @Query
		return productRepository.getByName(name);
	}
	
	public List<Product> getProductByNameAndPrice(String name,int price)
	{
		return productRepository.getProductByNameAndPrice(name, price);
	}
	
	
	// using Param
	public List<Product> getProductByNameAndPriceUsingParam(String name,int price)
	{
		return productRepository.getProductByNameAndPriceUsingParam(name, price);
	}
	
	
	
	public List<Product> getProductByPrice(int price)
	{
		return productRepository.findByProductPrice(price);
	}
	
	public List<Product> getProductPriceLessThan(int price)
	{
		return productRepository.findByProductPriceLessThan(price);
	}
	
	public List<Product> getProductPriceGreaterThan(int price)
	{
		return productRepository.findByProductPriceGreaterThan(price);
	}
	
	public List<Product> getProductPriceBetween(int start,int end)
	{
		return productRepository.findByProductPriceBetween(start,end);
	}
	
	

}