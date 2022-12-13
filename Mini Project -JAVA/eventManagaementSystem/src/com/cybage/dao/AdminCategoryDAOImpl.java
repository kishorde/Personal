package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.AdminCategory;
import com.cybage.model.OrganizerEventDetails;
import com.cybage.utility.jdbcUtility;

public class AdminCategoryDAOImpl implements AdminCategoryDAO{
	
	@Override
	public boolean addCategory(AdminCategory admincategory) {
		int rowcount=0;
		try (Connection connection = jdbcUtility.getConnection();) {

			// String insertQuery = "insert into pms (id,name, price) values(?,?,?)";
			String query = "insert into event_category (category_name) values(?)";
			PreparedStatement preparedstatement = connection.prepareStatement(query);

			
			preparedstatement.setString(1, admincategory.getCategoryName());
			//preStmt.setString(2, category.getDescription());
			

			rowcount = preparedstatement.executeUpdate();
			System.out.println("rowcount : " + rowcount);
			if (rowcount > 0) {
				System.out.println("Inserted");
			} else {
				System.out.println("error in method");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtility.closeConnection();
		}
		if (rowcount >0) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public AdminCategory getCategoryById(int categoryId) {
		
		try (Connection connection = jdbcUtility.getConnection();) {

			String query = "select * from event_category where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, categoryId);

			ResultSet rs = preparedstatement.executeQuery();
			
			while (rs.next()) {
				
				AdminCategory admincategory = new AdminCategory();
				admincategory.setCategoryId(rs.getInt("cat_id"));
				admincategory.setCategoryName(rs.getString("category_name"));
			
				return admincategory;
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtility.closeConnection();
		}
		return null;

		
	}

	@Override
	public List<AdminCategory> getAllCategory() 
	{
		
		Connection connection = jdbcUtility.getConnection();
		List<AdminCategory> admincategorylist = new ArrayList<>();

		try (Statement stmt = connection.createStatement()) {

			ResultSet rs = stmt.executeQuery("select * from event_category");

			while (rs.next()) 
			{

				AdminCategory admincategory = new AdminCategory();

				admincategory.setCategoryId(rs.getInt(1));
				admincategory.setCategoryName(rs.getString(2));
				//category.setDescription(rs.getString(3));
				

				admincategorylist.add(admincategory);

				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtility.closeConnection();
		}
		return admincategorylist;

	}

	@Override
	public boolean deleteCategory(int categoryId) {
		Connection connection = jdbcUtility.getConnection();
		int rowcount=0;
		try {
			String query = "delete from event_category where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(query);

			preparedstatement.setInt(1, categoryId);

			rowcount = preparedstatement.executeUpdate();
			System.out.println("rowcount : " + rowcount);
			if (rowcount > 0) {
				System.out.println("deleted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtility.closeConnection();
		}
		if (rowcount >0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateCategory(AdminCategory admincategory) {
		int rowcount=0;
		try (Connection connection = jdbcUtility.getConnection();) {

			String Query = "update event_category set category_name=? where category_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(Query);

			preparedstatement.setString(1, admincategory.getCategoryName());
			//preStmt.setString(2, category.getDescription());
			preparedstatement.setInt(2, admincategory.getCategoryId());
	

			rowcount = preparedstatement.executeUpdate();
			System.out.println("rowcount : " + rowcount);
			if (rowcount > 0) {
				System.out.println("Category updated successfully");
			} else {
				System.out.println("Some error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtility.closeConnection();
		}
		if (rowcount >0) {
			return true;
		} else {
			return false;
		}
	}

}
