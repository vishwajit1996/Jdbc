package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_insert_data {

	public static void main(String[] args) {
		
		try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_assignment", "root","root");
			
				Statement stmt = conn.createStatement();
			

				String sql = "INSERT INTO Employee (EmpId,EmpName,Designation,Email,Age) VALUES (?,?,?,?,?)";
			
								
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setInt(1,1501);
				ps.setString(2,"AKSHAY KULKARNI");
				ps.setString(3,"SOFTWARE ENGINEER");
				ps.setString(4,"jadhavvishwajit250@gmail.com");
				ps.setInt(5,24);
				
				ps.executeUpdate();
				
				System.out.println("Details inserted in Employee Table");
				
				conn.close();
				stmt.close();
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}