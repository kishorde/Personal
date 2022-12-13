package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.EventDetails;
import com.cybage.model.Registration;
import com.cybage.service.RegistrationService;
import com.cybage.utility.JDBCUtility;

public class RegistrationDAOImpl implements RegistrationDAO{

	public boolean AddUser(Registration registration)
	{
		try (Connection connection = JDBCUtility.getConnection();) {

			String Query = "insert into alluser(user_name, user_email ,user_password ,user_contact_no ,user_role) values(?,?,?,?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(Query);

			preparedstatement.setString(1, registration.getName());
			preparedstatement.setString(2, registration.getEmail());
			preparedstatement.setString(3, registration.getPassword());
			preparedstatement.setString(4, registration.getContact());
			preparedstatement.setString(5, registration.getRole());
			
			int rowcount = preparedstatement.executeUpdate();
			if (rowcount > 0) {
				System.out.println("user added");
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
	
	public Registration userLogin(Registration register) 
	{

		String userEmail = register.getEmail();
		String password = register.getPassword();
		String role=register.getRole();

		try  (Connection connection = JDBCUtility.getConnection();) {
			//Connection connection = JDBCUtility.getConnection();
			String query = "select * from alluser where user_email=? and user_password=?";

			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, userEmail);
			preparedstatement.setString(2, password);
//			preparedstatement.setString(3, role);
			
			
			ResultSet result = preparedstatement.executeQuery();
			
			while (result.next()){
				register.setUserID(result.getInt(1));
				register.setName(result.getString(2));
				register.setEmail(result.getString(3));
				register.setContact(result.getString(5));
				register.setRole(result.getString(6));
			}
			System.out.println("this is role in impl: " + register.getRole());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return register;
	}
	
	
	
	
	public List<Registration> getAllUsers() 
	{
		Connection connection = JDBCUtility.getConnection();
		List<Registration> userList = new ArrayList<>();

		try (Statement statement = connection.createStatement()) 
		{
			String Query="select user_id, user_name, user_email, user_contact_no, user_role from alluser where user_role='Organizer'";

			ResultSet resultset = statement.executeQuery(Query);

			while (resultset.next()) {

				Registration users = new Registration();

				users.setUserID(resultset.getInt(1));
				users.setName(resultset.getString(2));
				users.setEmail(resultset.getString(3));
				users.setContact(resultset.getString(4));
				users.setRole(resultset.getString(5));
				
				userList.add(users);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return userList;

	}
	
	public Registration getUserProfileDetailsById(int userId) 
	{
	
			try (Connection connection = JDBCUtility.getConnection();) {

				String query = "select * from alluser where user_id=?";
				PreparedStatement preparedstatement = connection.prepareStatement(query);
				preparedstatement.setInt(1, userId);

				ResultSet resultset = preparedstatement.executeQuery();
				
				while (resultset.next()) 
				{
					Registration user=new Registration();
					user.setUserID(resultset.getInt("user_id"));
					user.setName(resultset.getString("user_name"));
					user.setEmail(resultset.getString("user_email"));
					user.setContact(resultset.getString("user_contact_no"));
					user.setPassword(resultset.getString("user_password"));
					
					return user;
					//System.out.println(id + "  " + name + "  " + salary);

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtility.closeConnection();
			}
			return null;

			
		}
	
	@Override
	public boolean updateUserProfile(Registration register) 
	{
		
			int rowcount=0;
			
			try (Connection connection = JDBCUtility.getConnection();) {

				String updateQuery = "update alluser set user_name=?, user_email=?, user_password=?,user_contact_no=? where user_id=?";
				PreparedStatement preparedstatement = connection.prepareStatement(updateQuery);

				preparedstatement.setString(1, register.getName());
				preparedstatement.setString(2, register.getEmail());
				preparedstatement.setString(3, register.getPassword());
				preparedstatement.setString(4, register.getContact());
				preparedstatement.setInt(5, register.getUserID());

				rowcount = preparedstatement.executeUpdate();
				System.out.println("rowcount: " + rowcount);
				if (rowcount>0) {
					System.out.println(" update successfully");
				} else {
					System.out.println(" error");
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtility.closeConnection();
			}
			if(rowcount>0) 
			{
			return true;
			}
			else 
			{
			return false;
			}
		
	}
	
	
	
}
