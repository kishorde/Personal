package com.cybage.service;

import java.util.List;

import com.cybage.model.AdminCategory;

public interface AdminService {
	
	public boolean addCategory(AdminCategory admincategory);
	public List<AdminCategory> getAllCategory();
	public AdminCategory getCategoryById(int category_id);
	public boolean deleteCategory(int categoryId);
	public boolean updateCategory(AdminCategory admincategory);
	
}
