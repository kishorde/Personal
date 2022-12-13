package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Order;
import com.cybage.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/")
	public ResponseEntity<String> addOrder(@RequestBody Order order)
	{
		orderService.addOrder(order);
		return new ResponseEntity<String>("Order added Successfully!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Order>> getAllOrders()
	{
		List<Order> orderList = orderService.getAllOrders();
		return new ResponseEntity<List<Order>>(orderList,HttpStatus.CREATED);
	}

}