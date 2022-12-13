package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.bean.Employee;
import com.cybage.utility.JDBCUtility;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public boolean add(Employee employee) {
		// TODO Auto-generated method stub
		try (Connection connection = JDBCUtility.getConnection();) {

			String insertQuery = "insert into employee (id, name, salary) values(?,?,?)";
			PreparedStatement preStmt = connection.prepareStatement(insertQuery);

			preStmt.setInt(1, employee.getId());
			preStmt.setString(2, employee.getName());
			preStmt.setInt(3, employee.getSalary());

			int no = preStmt.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("employee inserted successfully");
			} else {
				System.out.println(" error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return true;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "select * from employee where id=?";
			PreparedStatement preStmt = connection.prepareStatement(query);
			preStmt.setInt(1, empId);

			ResultSet rs = preStmt.executeQuery();
			int id, salary;
			String name;
			while (rs.next()) {
				Employee employee=new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getInt("salary"));
				
				return employee;
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
	public List<Employee> getAllEmployees() {
		Connection connection = JDBCUtility.getConnection();
		List<Employee> list = new ArrayList<>();

		try (Statement stmt = connection.createStatement()) 
		{
			ResultSet rs = stmt.executeQuery("select * from employee");
		
			while (rs.next()) {

				Employee employee = new Employee();

				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getInt(3));

				list.add(employee);

			}
//			list.forEach((pms) -> System.out.println(pms));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return list;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		Connection connection = JDBCUtility.getConnection();
		int no=0;
		try {
			String deleteQuery = "delete from employee where id=?";
			PreparedStatement preStmt = connection.prepareStatement(deleteQuery);

			preStmt.setInt(1, empId);

			no = preStmt.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("Employyee delete successfully");
			};

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

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int no=0;
		try (Connection connection = JDBCUtility.getConnection();) {

			String updateQuery = "update employee set name=?, salary=? where id=?";
			PreparedStatement preStmt = connection.prepareStatement(updateQuery);

			preStmt.setInt(3, employee.getId());
			preStmt.setString(1, employee.getName());
			preStmt.setInt(2, employee.getSalary());

			 no = preStmt.executeUpdate();
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
