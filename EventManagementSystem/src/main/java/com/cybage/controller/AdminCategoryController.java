package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.AdminCategory;
import com.cybage.service.AdminCategoryService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/category")
public class AdminCategoryController {

	@Autowired AdminCategoryService adminCategoryService;
	
	@PostMapping("/addCategory")
	public ResponseEntity<String> addCategory(@RequestBody AdminCategory adminCategory)
	{
		AdminCategory adminCategory1 = adminCategoryService.addCategory(adminCategory);
		return new ResponseEntity<String>("Category Added Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<List<AdminCategory>> getAllCategory()
	{
		List<AdminCategory> categoryList = adminCategoryService.getAllCategory();
		return new ResponseEntity<List<AdminCategory>>(categoryList,HttpStatus.OK);
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<AdminCategory> getCategoryById(@PathVariable int categoryId)
	{
		AdminCategory adminCategory1 = adminCategoryService.getCategoryById(categoryId);

		if(adminCategory1==null)
			throw new RecordNotFoundException("Category not found!!");
		return new ResponseEntity<AdminCategory>(adminCategory1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable int categoryId)
	{
		adminCategoryService.deleteCategory(categoryId);
		return new ResponseEntity<String>("Category Deleted Successfully!",HttpStatus.CREATED);
//	}
	}
	
	@PutMapping("/{categoryId}")
	public ResponseEntity<String> updateCategory(@PathVariable int categoryId,@RequestBody AdminCategory adminCategory)
	{
		adminCategoryService.updateCategory(categoryId, adminCategory);
		return new ResponseEntity<String>("Category updated Successfully!!!",HttpStatus.CREATED);
	}
	
}
