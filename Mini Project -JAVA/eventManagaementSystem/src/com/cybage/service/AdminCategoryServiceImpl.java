package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminCategoryDAO;
import com.cybage.dao.AdminCategoryDAOImpl;
import com.cybage.model.AdminCategory;
import com.cybage.model.OrganizerEventDetails;

public class AdminCategoryServiceImpl implements AdminCategoryService
{
	
	private AdminCategoryDAO admincategorydao=new AdminCategoryDAOImpl(); 
	
		
	@Override
	public boolean addCategory(AdminCategory admincategory) {
		// TODO Auto-generated method stub
		return admincategorydao.addCategory(admincategory);
	}

	@Override
	public AdminCategory getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return admincategorydao.getCategoryById(categoryId);
	}

	@Override
	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		return admincategorydao.deleteCategory(categoryId);
	}

	@Override
	public boolean updateCategory(AdminCategory admincategory) {
		// TODO Auto-generated method stub
		return admincategorydao.updateCategory(admincategory);
	}

	@Override
	public List<AdminCategory> getAllCategory() {
		// TODO Auto-generated method stub
		return admincategorydao.getAllCategory();
	}



}
