package com.web.azim;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.azim.User;

public class UserDao {

	public UserDao() {
		
	}
	
	public boolean check(String username,String password) {
		
		String query = "SELECT * FROM user WHERE username=? and password=?;";
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/users","root",""); 
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				return true;
	         }
	         rs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		 
		return false;
	}

}
