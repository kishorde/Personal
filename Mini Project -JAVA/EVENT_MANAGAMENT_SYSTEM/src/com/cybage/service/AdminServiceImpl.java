package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDAO;
import com.cybage.dao.AdminDAOImpl;
import com.cybage.model.AdminCategory;

public class AdminServiceImpl  implements AdminService{

	private AdminDAO admindao=new AdminDAOImpl();
	
	
	public boolean addCategory(AdminCategory admincategory)
	{
		return admindao.addCategory(admincategory);
	}
	
	public List<AdminCategory> getAllCategory()
	{
		return admindao.getAllCategory();
	}
	
	
	public AdminCategory getCategoryById(int category_id) 
	{
		return admindao.getCategoryById(category_id);
	}
	public boolean deleteCategory(int categoryId) 
	{
		return admindao.deleteCategory(categoryId);
	}
	public boolean updateCategory(AdminCategory admincategory)
	{
		return admindao.updateCategory(admincategory);
	}
	
	
}
