package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

		try  (Connection connection = JDBCUtility.getConnection();) {
			//Connection connection = JDBCUtility.getConnection();
			String query = "select * from userall where user_email=? and user_password=? and user_role=?";

			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, userEmail);
			preparedstatement.setString(2, password);
			
			
			ResultSet result = preparedstatement.executeQuery();
			
			while (result.next()) 
			{
				register.setUserID(result.getInt("userID"));
				register.setName(result.getString("name"));
				register.setRole(result.getString("role"));
				register.setEmail(userEmail);
				register.setContact(result.getString("contact"));
				register.setPassword(password);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return register;
	}
	
	
}
