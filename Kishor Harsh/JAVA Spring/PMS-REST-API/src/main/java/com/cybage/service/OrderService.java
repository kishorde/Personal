package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Order;

@Service
public class OrderService {
	
	List<Order> orderList = new ArrayList<>();
	
	public void addOrder(Order order)
	{
		orderList.add(order);
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderList;
	}

}
