package com.cybage.dao;

import java.util.List;

import com.cybage.model.AdminCategory;
import com.cybage.model.EventDetails;

public interface AdminDAO {
	

	public boolean addCategory(AdminCategory admincategory);
	public List<AdminCategory> getAllCategory();
	public AdminCategory getCategoryById(int category_id);
	public boolean deleteCategory(int categoryId);
	public boolean updateCategory(AdminCategory admincategory);
	
}
