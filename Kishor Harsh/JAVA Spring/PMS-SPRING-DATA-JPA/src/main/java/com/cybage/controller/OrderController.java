package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Order;
import com.cybage.model.Product;
import com.cybage.service.OrderService;
import com.cybage.service.ProductService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/")
	public ResponseEntity<Order> addOrder(@RequestBody Order order)
	{
		Order orderList = orderService.add(order);
		return new ResponseEntity<Order>(orderList,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Order>> getAllOrders()
	{
		List<Order> orderList = orderService.getAllOrders();
		return new ResponseEntity<List<Order>>(orderList,HttpStatus.OK);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity<Order> getOrder(@PathVariable int orderId)
	{
		Order order1 = orderService.getOrderById(orderId);
//		if(product1==null)
//			throw new RecoredNotFoundException("Product not Found",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable int orderId)
	{
			orderService.deleteOrderById(orderId);
			return new ResponseEntity<String>("Product Deleted Successfully!",HttpStatus.CREATED);
	}

}
