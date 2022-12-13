package com.cybage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Product_Info")
public class Product {

	
	@Id
	@GeneratedValue
	@Column(name="Product_Id")
	private int productId;
	
	
	@Column(name="Product_Name")
	private String productName;
	
	private int productPrice;
	
	
	@OneToMany(mappedBy="product")
	@JsonIgnore							// it will ignore this property while fetching data
	private List<Order> orderList;
	
	
//	@ManyToOne
//	private Order order;
	
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
	/*
	 * public Product(int productId, String productName, int productPrice) {
	 * super(); this.productId = productId; this.productName = productName;
	 * this.productPrice = productPrice; }
	 * 
	 * public Product() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public int getProductId() { return productId; }
	 * 
	 * public void setProductId(int productId) { this.productId = productId; }
	 * 
	 * public String getProductName() { return productName; }
	 * 
	 * public void setProductName(String productName) { this.productName =
	 * productName; }
	 * 
	 * public int getProductPrice() { return productPrice; }
	 * 
	 * public void setProductPrice(int productPrice) { this.productPrice =
	 * productPrice; }
	 * 
	 * 
	 */
	
}
