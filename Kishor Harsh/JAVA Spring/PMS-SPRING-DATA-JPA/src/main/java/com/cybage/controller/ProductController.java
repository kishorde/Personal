package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Product;
import com.cybage.service.ProductService;


@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired 
	private ProductService productService;
	
	@PostMapping("/admin")
	public ResponseEntity<String> addProduct(@RequestBody Product product)
	{
		Product product1 = productService.addProduct(product);
		return new ResponseEntity<String>("Product added Successfully!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> productList = productService.getAllProduct();
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id)
	{
		Product product1 = productService.getProductById(id);
//		if(product1==null)
//			throw new RecoredNotFoundException("Product not Found",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Product>(product1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id)
	{
			productService.deleteProduct(id);
			return new ResponseEntity<String>("Product Deleted Successfully!",HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable int id,@RequestBody Product product)
	{
		productService.updateProduct(id,product);
		return new ResponseEntity<String>("Product updated Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/productName/{name}")
	public ResponseEntity<List<Product>> getProductByName(@PathVariable String name)
	{
		List<Product> productList =productService.getProductByName(name);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@GetMapping("/productNameAndPrice/{name}/{price}")
	public ResponseEntity<List<Product>> getProductByNameAndPrice(@PathVariable String name,@PathVariable int price)
	{
		List<Product> productList =productService.getProductByNameAndPrice(name,price);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
		
	}
	
	@GetMapping("/productNameAndPriceUsingParam/{name}/{price}")
	public ResponseEntity<List<Product>> getProductByNameAndPriceUsingParam(@PathVariable String name,@PathVariable int price)
	{
		List<Product> productList =productService.getProductByNameAndPriceUsingParam(name,price);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
		
	}
	
	@GetMapping("/productPrice/{price}")
	public ResponseEntity<List<Product>> getProductByPrice(@PathVariable int price)
	{
		List<Product> productList =productService.getProductByPrice(price);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
		
	}
	
	@GetMapping("/productPriceLessThan/{price}")
	public ResponseEntity<List<Product>> getProductPriceLessThan(@PathVariable int price)
	{
		List<Product> productList =productService.getProductPriceLessThan(price);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
		
	}
	
	@GetMapping("/productPriceGreaterThan/{price}")
	public ResponseEntity<List<Product>> getProductPriceGreaterThan(@PathVariable int price)
	{
		List<Product> productList =productService.getProductPriceGreaterThan(price);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@GetMapping("/productBetween/{start}/{end}")
	public ResponseEntity<List<Product>> getProductPriceBetween(@PathVariable int start,@PathVariable int end)
	{
		List<Product> productList =productService.getProductPriceBetween(start,end);
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
}
