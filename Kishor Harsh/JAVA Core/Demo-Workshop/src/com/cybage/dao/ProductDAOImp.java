package com.cybage.dao;

import java.sql.Statement;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cybage.jdbc.JDBCUtility;
import com.cybage.model.Product;

public class ProductDAOImp implements ProductDAO {
	
	ProductDAOImp productDAOImp=new ProductDAOImp();

	public int getProductById(int productId) {
		return 0;
	}

	public void addProduct(Product product) {
		try (Connection connection=JDBCUtility.getConnection();)
		{
//			System.out.println("Add Product");
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.print("Enter Id :");
//			int id = sc.nextInt();
//			System.out.print("Enter Name :");
//			String name = sc.next();
//			System.out.print("Enter price :");
//			int price = sc.nextInt();

			PreparedStatement pStatement = connection.prepareStatement("insert into productdetails (id,name,price) values(?,?,?)");

			pStatement.setInt(1, product.getId());
			pStatement.setString(2, product.getName());
			pStatement.setInt(3, product.getPrice());

			int result = pStatement.executeUpdate();

			if (result > 0) {
				System.out.println("Product added Sussussfully!!!");
			} else {
				System.out.println("Insertion Failed!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Product> getAllProduct() throws ClassNotFoundException
	{
		Connection connection=JDBCUtility.getConnection();
		List<Product> list = new ArrayList<>();
		
		try (Statement statement=connection.createStatement())
		{
			ResultSet resultSet=statement.executeQuery("Select * from productdetails");
			
			
			while(resultSet.next())
			{
				Product product = new Product();
				
				product.setId(resultSet.getInt(1));
				product.setName(resultSet.getString(2));
				product.setPrice(resultSet.getInt(3));
				
				list.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

	public void deleteProduct(int productId) {
		
		try (Connection connection=JDBCUtility.getConnection();)
		{
			System.out.println("Delete Data:-");

			Scanner sc = new Scanner(System.in);

			

			PreparedStatement pStatement = connection.prepareStatement("delete from productdetails where id=?");

			int result = pStatement.executeUpdate();

			if (result > 0) {
				System.out.println("Deleted Sussussfully!!!");
			} else {
				System.out.println("Deletion Failed!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

