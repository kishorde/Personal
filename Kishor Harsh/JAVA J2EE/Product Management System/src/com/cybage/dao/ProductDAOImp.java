package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cybage.utility.JDBCUtility;

import com.cybage.model.Product;

public class ProductDAOImp implements ProductDAO {

	@Override
	public Product getProductbyId(int productId) {
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "select * from pms where id=?";
			PreparedStatement preStmt = connection.prepareStatement(query);
			preStmt.setInt(1, productId);

			ResultSet rs = preStmt.executeQuery();
			int id, price;
			String name;
			while (rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				price = rs.getInt("price");

				System.out.println(id + "  " + name + "  " + price);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}

		return null;
	}

	@Override
	public void addProduct(Product product) {

		try (Connection connection = JDBCUtility.getConnection();) {

			String insertQuery = "insert into pms (id, name, price) values(?,?,?)";
			PreparedStatement preStmt = connection.prepareStatement(insertQuery);

			preStmt.setInt(1, product.getId());
			preStmt.setString(2, product.getName());
			preStmt.setInt(3, product.getPrice());

			int no = preStmt.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("Product inserted successfully");
			} else {
				System.out.println("Some error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}

	}

	@Override
	public List<Product> getAllProduct() {
		Connection connection = JDBCUtility.getConnection();
		List<Product> list = new ArrayList<>();

		try (Statement stmt = connection.createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from pms");
			/*
			 * int id; int price; String name;
			 */

			while (rs.next()) {

				Product product = new Product();

				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getInt(3));

				list.add(product);

			}
			list.forEach((pms) -> System.out.println(pms));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return list;

	}

	@Override
	public void deleteProduct(int productId) {

		Connection connection = JDBCUtility.getConnection();

		try {
			String deleteQuery = "delete from pms where id=?";
			PreparedStatement preStmt = connection.prepareStatement(deleteQuery);

			preStmt.setInt(1, productId);

			int no = preStmt.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("product delete successfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}

	}

	@Override
	public void updateProduct(int productId, String name, int price) {

		try (Connection connection = JDBCUtility.getConnection();) {

			String updateQuery = "update pms set name=?, price=? where id=?";
			PreparedStatement preStmt = connection.prepareStatement(updateQuery);

			preStmt.setString(1, name);
			preStmt.setInt(2, price);
			preStmt.setInt(3, productId);

			int no = preStmt.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("Product update successfully");
			} else {
				System.out.println("Some error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}

	}

}
