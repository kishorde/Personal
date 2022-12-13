package com.cybage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Order;
import com.cybage.model.Product;
import com.cybage.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order add(Order order) {
		
		return orderRepository.save(order);
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	//getOrderById:
	public Order getOrderById(int orderId) {
		
		return orderRepository.findById(orderId).orElse(null);
	}
		
	//DeleteOrderById:
	public void deleteOrderById(int orderId) {
		
		orderRepository.deleteById(orderId);
	}

}