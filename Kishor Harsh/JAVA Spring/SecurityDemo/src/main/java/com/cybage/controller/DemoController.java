package com.cybage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello from Spring Security";
	}
	
	
	@GetMapping("/admin")
	public String sayAdmin()
	{
		return "Hello from admin";
	}

}
