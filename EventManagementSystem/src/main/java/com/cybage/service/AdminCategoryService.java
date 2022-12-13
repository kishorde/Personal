package com.cybage.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.AdminCategory;
import com.cybage.repository.AdminCategoryRepository;

@Service
public class AdminCategoryService {

	Logger logger=  LoggerFactory.getLogger(AdminCategoryService.class);
	
	@Autowired AdminCategoryRepository adminCategoryRepository;
	
	public AdminCategory addCategory(AdminCategory adminCategory)
	{
		logger.info("Add category method called....");
		return adminCategoryRepository.save(adminCategory);
	}
	
	public List<AdminCategory> getAllCategory()
	{
		logger.info("getAllCategory method called....");
		return adminCategoryRepository.findAll();
	}
		
	public AdminCategory getCategoryById(int categoryId)
	{
		logger.info("Get category by id method called....");
		return adminCategoryRepository.findById(categoryId).orElse(null);
	}

	public void deleteCategory(int categoryId) 
	{
		logger.info("delete by id method called....");
		adminCategoryRepository.deleteById(categoryId);
	}
	
	public AdminCategory updateCategory(int categoryId,AdminCategory adminCategory)
	{
		AdminCategory adminCategory1=adminCategoryRepository.findById(categoryId).get();
		if(adminCategory.getCategoryName()!=null)
			adminCategory1.setCategoryName(adminCategory.getCategoryName());
		
		if(adminCategory.getCategoryImage()!=null)
			adminCategory1.setCategoryImage(adminCategory.getCategoryImage());
		
		return 	adminCategoryRepository.save(adminCategory1);
	}
}
