package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.InvalidInputException;
import com.cybage.exception.RecordNotFoundException;

@RestController
public class FirstController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		int i = 5;
		if(i==5)
//			throw new RecordNotFoundException("some random message");
			throw new InvalidInputException("Invalid input");
		return "Hello from REST - API";
	}
	
	@GetMapping("/fruitList")
	public List<String> getFruitList() 
	{
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Chickoo");
		fruitList.add("Banana");
		fruitList.add("Mango");
		return fruitList;
	}
}
