package com.cybage.model;

public class Product {

	public int id,price;
	private String name;
	public Product(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public Product() {
	
	}
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	
	
}
