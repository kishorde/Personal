package com.cybage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Product {

	// with database this annotation will work
	
	/*
	 * @AllArgsConstructor
	 * 
	 * @NoArgsConstructor
	 * 
	 * @Getter
	 * 
	 * @Setter
	 * 
	 * @ToString
	 */
	private int productId;
	private String productName;
	private int productPrice;
	
	public Product()
	{
		
	}
	
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
