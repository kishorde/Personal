package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
//import com.mysql.cj.jdbc.CallableStatement;
import java.sql.CallableStatement;

public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=JDBCUtility.getConnection();
				
		try( CallableStatement cStatement = connection.prepareCall("{call GetName(?,?)}"))
		{	
				cStatement.setInt(1, 1);
				cStatement.registerOutParameter(2, Types.VARCHAR);
				cStatement.execute();
				String name = cStatement.getString(2);
				
				System.out.println(name);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
