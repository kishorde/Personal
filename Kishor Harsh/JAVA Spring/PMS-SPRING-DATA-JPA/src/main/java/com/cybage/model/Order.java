package com.cybage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="order_info")

public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;

	
	@ManyToOne
	private Product product;
	
	
//	@OneToMany(mappedBy="order")
//	private List<Product> productList;
	
	/*
	 * public Order() {
	 * 
	 * } public int getOrderId() { return orderId; } public void setOrderId(int
	 * orderId) { this.orderId = orderId; } public Product getProduct() { return
	 * product; } public void setProduct(Product product) { this.product = product;
	 * }
	 * 
	 * @Override public String toString() { return "Order [orderId=" + orderId +
	 * ", product=" + product + "]"; }
	 * 
	 */

}