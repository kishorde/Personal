package com.cybage.model;

public class AdminCategory {

	String categoryName;
	int categoryId;
	
	
	public AdminCategory()
	{
		
	}


	public AdminCategory(String categoryName, int categoryId) {
		super();
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
