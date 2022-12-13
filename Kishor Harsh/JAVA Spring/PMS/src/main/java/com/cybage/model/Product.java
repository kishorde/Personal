package com.cybage.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Product {
	
	@Min(1000)					//MIN value is 1000
	@Max(10000)					//MAX value will be 10000
	private int productId;
	
	@NotEmpty					// input should not be empty
	@Size(min=3,max=20)		// minimun 3 character and max 20 charachter
	private String productName;
	
	
	private int price;
	
	public Product()
	{
		
	}
	public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
