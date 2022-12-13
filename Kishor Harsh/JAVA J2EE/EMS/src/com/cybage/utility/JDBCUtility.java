package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {
	
	private static Connection connection = null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EventManagementSystem", "root", "root");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return connection;

	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
