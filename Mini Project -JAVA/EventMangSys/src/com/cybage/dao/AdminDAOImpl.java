package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.AdminCategory;
import com.cybage.utility.JDBCUtility;

public class AdminDAOImpl implements AdminDAO{
	
	
	public boolean addCategory(AdminCategory admincategory) {
		// TODO Auto-generated method stub
		try (Connection connection = JDBCUtility.getConnection();) {

			String insertQuery = "insert into event_category (category_name) values(?)";
			PreparedStatement preparedstatement = connection.prepareStatement(insertQuery);

			preparedstatement.setString(1, admincategory.getCategoryName());
			

			int rowcount = preparedstatement.executeUpdate();
			if (rowcount > 0) {
				System.out.println("Category added");
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return true;
	}
	
	
	public List<AdminCategory> getAllCategory()
	{
		Connection connection = JDBCUtility.getConnection();
		List<AdminCategory> list = new ArrayList<>();

		try (Statement statement = connection.createStatement()) 
		{
			ResultSet resultset = statement.executeQuery("select * from event_category");
		
			while (resultset.next()) {

				AdminCategory admincategory = new AdminCategory();

				admincategory.setCategoryId(resultset.getInt(1));
				admincategory.setCategoryName(resultset.getString(2));
				

				list.add(admincategory);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return list;
	}
	
	public AdminCategory getCategoryById(int category_id)
	{
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "select * from event_category where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, category_id);

			ResultSet resultset = preparedstatement.executeQuery();
			
			int categoryId;
			String categoryName;
			
			while (resultset.next()) {
				AdminCategory admincategory=new AdminCategory();
				
				admincategory.setCategoryId(category_id);
				
				admincategory.setCategoryName(resultset.getString("category_name"));
				
				
				return admincategory;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return null;

		
	}
	
	
	public boolean deleteCategory(int categoryId)
	{
		Connection connection = JDBCUtility.getConnection();
		int no=0;
		try {
			String Query = "delete from event_category where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(Query);

			preparedstatement.setInt(1, categoryId);

			no = preparedstatement.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		if(no>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean updateCategory(AdminCategory admincategory)
	{
		int no=0;
		try (Connection connection = JDBCUtility.getConnection();) {

			String updateQuery = "update event_category set category_name=? where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(updateQuery);

			preparedstatement.setString(1, admincategory.getCategoryName());
			preparedstatement.setInt(2, admincategory.getCategoryId());
			

			 no = preparedstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("Employee update successfully");
			} else {
				System.out.println("Some error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		if(no>0) 
		{
		return true;
		}
		else 
		{
		return false;
		}
	}
	

}
