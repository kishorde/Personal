package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybage.model.Product;

@RestController
public class DemoController {

	@Autowired
	private RestTemplate restTemplate;
	
	private String baseUrl="http://localhost:8080/product";
	
	
	
	@GetMapping("/getProducts")
	public ResponseEntity<Product[]> getALLProduct()
	{
		return restTemplate.getForEntity(baseUrl+"/", Product[].class);
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product)
	{
		return restTemplate.postForEntity("http://localhost:8080/product"+"/",product,String.class);
	}
	
	@GetMapping("/getProductById/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id)
	{
		return restTemplate.getForEntity(baseUrl+"/"+id, Product.class);
	}
	
	@GetMapping("/getProductByName/{name}")
	public ResponseEntity<Product> getProductByName(@PathVariable String name)
	{
		return restTemplate.getForEntity(baseUrl+"/productName/"+name, Product.class);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id)
	{
		restTemplate.delete(baseUrl+"/"+id,String.class);
		return new ResponseEntity<String>("Product Deleted from api",HttpStatus.OK);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product product)
	{
		restTemplate.put(baseUrl + "/",product,String.class);
		return new ResponseEntity<String>("Product Updated From Api",HttpStatus.OK);
	}
	
	
}