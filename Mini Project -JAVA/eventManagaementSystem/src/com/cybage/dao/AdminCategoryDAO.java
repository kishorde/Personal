package com.cybage.dao;

import java.util.List;

import com.cybage.model.AdminCategory;
import com.cybage.model.OrganizerEventDetails;

public interface AdminCategoryDAO {

	public boolean addCategory(AdminCategory admincategory);
	public AdminCategory getCategoryById(int categoryId);
	//public List<EventCategory> getAllCategory();
	public boolean deleteCategory(int categoryId);
	public boolean updateCategory(AdminCategory admincategory);
//	public List<OrganizerEventDetails> getAllCategory();
	public List<AdminCategory> getAllCategory();
}
