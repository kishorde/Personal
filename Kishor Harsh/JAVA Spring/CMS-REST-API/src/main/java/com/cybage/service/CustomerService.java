package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Customer;

@Service
public class CustomerService {
	
	List<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerService()
	{
		customerList.add(new Customer(100,"Kishor","Osmanabad","kishor@cybage.com"));
		customerList.add(new Customer(101,"Harsh","Nagpur","harsh@cybage.com"));
		customerList.add(new Customer(102,"Ujjwal","Nagpur","@cybage.com"));
		customerList.add(new Customer(103,"Abhishek","Kolhapur","abhishek@cybage.com"));
		customerList.add(new Customer(104,"Shrikant","Sangli","shrikant@cybage.com"));
		customerList.add(new Customer(105,"Sanskruti","Pune","sanskruti@cybage.com"));
		customerList.add(new Customer(106,"Ritu","Gondiya","ritu@cybage.com"));
	}
	
	public List<Customer> getAllCustomer()
	{
		return customerList;
	}
	
	public Customer getCustomerById(int id)
	{
		Customer customer1 = customerList.stream().filter(customer->customer.getId()==id).findFirst().orElse(null);
		return customer1;
	}
	
	public boolean addCustomer(Customer customer)
	{
		return customerList.add(customer);
	}
	
	public Customer deleteCustomer(int id)
	{
		Customer customer = getCustomerById(id);
		if(customer==null)
			return null;
		customerList.remove(customer);
		return new Customer();
	}
	
	public void updateCustomer(Customer customer)
	{
		Customer customer1=getCustomerById(customer.getId());
		
		int index=customerList.indexOf(customer1);
		customerList.set(index, customer);
	}
	
	public Customer getCustomerByName(String name)
	{
		Customer customerByName = customerList.stream().filter(customer->customer.getName().equals(name)).findFirst().get();
		return customerByName;
	}

}
