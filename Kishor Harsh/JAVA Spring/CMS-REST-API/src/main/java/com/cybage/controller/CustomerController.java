package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.CustomerNotFoundException;
import com.cybage.model.Customer;
import com.cybage.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	//Displaying the List of Customers:
	@GetMapping("/")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK);
	}
	
	//Displaying a particular customer:
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int id)
	{
		Customer customer = customerService.getCustomerById(id);
		if(customer==null)
			throw new CustomerNotFoundException("Customer Not Found!!");
		return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer1)
	{
		
		boolean flag=customerService.addCustomer(customer1);
		if(flag)
			return new ResponseEntity<String>("Customer added Succesfully!",HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Some error",HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id)
	{
		Customer customer = customerService.deleteCustomer(id);	
		if(customer==null)
		{
			throw new CustomerNotFoundException("Customer not found for deletion");
		}
		else
		{
			return new ResponseEntity<String>("Customer Deleted Successfully!",HttpStatus.CREATED);
		}
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer)
	{
		customerService.updateCustomer(customer);
		return new ResponseEntity<String>("Customer updated Successfully!",HttpStatus.OK);
	}
	
	
	

}