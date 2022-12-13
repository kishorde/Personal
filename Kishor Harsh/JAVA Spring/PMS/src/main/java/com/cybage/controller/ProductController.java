package com.cybage.controller;

import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Product;
import com.cybage.service.ProductService;

@Controller	
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "greet";
	}

	//@RequestMapping("/welcome")
	@GetMapping("/welcome")
	public ModelAndView welcome(Model model)
	{
//		model.addAttribute("name","john");
//		return new ModelAndView("welcome");
		
		return new ModelAndView("welcome","name","Jhonn");
	}
	
//	@GetMapping("/getAllProducts")
//	public String getAllProduct()
//	{
//		List<Product> productList = productService.getAllProduct();
//		System.out.println(productList);
//		return "greet";
//	}
	
	
	@GetMapping("/getAllProducts")
	public ModelAndView getAllProduct()
	{
		List<Product> productList = productService.getAllProduct();
		
		return new ModelAndView("displayProducts","product",productList);
	}
	
	@GetMapping("/getProductById/{id}")
	public ModelAndView getProductById(@PathVariable int id)
	{
		Product products = productService.getProductById(id);
		
		return new ModelAndView("productByIdPage","product",products);
	}
	
	@GetMapping("/addProductForm")
	public ModelAndView showAddProductForm()
	{
		Product product =new Product();
		
		return new ModelAndView("addProduct","product",product);
	}
	
	@PostMapping("/addProduct")
	public ModelAndView addProduct(@Valid @ModelAttribute Product product,BindingResult result)
	{
		if(result.hasErrors())
			return new ModelAndView("addProduct","product",product);
	
		productService.addProduct(product);
		List<Product> productList = productService.getAllProduct();
		
		return new ModelAndView("displayProducts","product",productList);
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteProduct(@PathVariable int id)
	{
		productService.deleteProduct(id);
		
		List<Product> productList = productService.getAllProduct();
		return new ModelAndView("displayProducts","product",productList);
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView updateForm(@PathVariable int id)
	{
		Product product = productService.getProductById(id);
		
		return new ModelAndView("updateForm","product",product);
		
	}
	
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProduct(@ModelAttribute Product product)
	{
		productService.updateProduct(product);
		List<Product> productList = productService.getAllProduct();
		return new ModelAndView("displayProducts","product",productList);

	}
	
	
	
	

}
