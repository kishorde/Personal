package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.Product;
import com.cybage.service.ProductService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
//	@GetMapping("/")
//	public List<Product> getAllProducts()
//	{
//		return productService.getAllProduct();
//	}
	
	//line 24 and 32 are same functions, 32 will return httpstatus
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProduct()
	{
		return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	
//	@GetMapping("/{id}")
//	public Product getProduct(@PathVariable int id)
//	{
//		return productService.getProductById(id);
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id)
	{
		Product product = productService.getProductById(id);
		if(product==null)
			throw new RecordNotFoundException("Product not found!!");
		return new ResponseEntity<Product>(productService.getProductById(id),HttpStatus.OK);
	}
	
	//normal code without exception:
//	@PostMapping("/")
//	public ResponseEntity<String> addProduct(@RequestBody Product product1)
//	{
//		
//		boolean flag=productService.addProduct(product1);
//		if(flag)
//			return new ResponseEntity<String>("Product added Succesfully!",HttpStatus.CREATED);
//		else
//			return new ResponseEntity<String>("Some error",HttpStatus.BAD_REQUEST);
//	}
	
	//with exception code:
	@PostMapping("/")
	public ResponseEntity<String> addProduct(@RequestBody Product product1)
	{
		
		boolean flag=productService.addProduct(product1);
		if(flag)
			return new ResponseEntity<String>("Product added Succesfully!",HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Some error",HttpStatus.BAD_REQUEST);
	}
	
	//normal code
//	@DeleteMapping("/{id}")
//	public ResponseEntity<String> deleteProduct(@PathVariable int id)
//	{
//		boolean flag=productService.deleteProduct(id);
//		if(flag)
//			return new ResponseEntity<String>("Product Deleted Succesfully!",HttpStatus.CREATED);
//		else
//			return new ResponseEntity<String>("Some error in deletion",HttpStatus.BAD_REQUEST);
//
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id)
	{
		Product product = productService.deleteProduct(id);
		
		if(product==null)
		{
			throw new RecordNotFoundException("Product not found for deletion");
		}
		else
		{
			return new ResponseEntity<String>("Product Deleted Successfully!",HttpStatus.CREATED);
		}
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateProduct(@RequestBody Product product)
	{
		productService.updateProduct(product);
		return new ResponseEntity<String>("Product updated Successfully!",HttpStatus.OK);
	}
	
	@GetMapping("productName/{name}")
	public ResponseEntity<Product> getProductByName(@PathVariable String name)
	{
		return new ResponseEntity<Product>(productService.getProductByName(name),HttpStatus.OK);
	}
	
	
	
}