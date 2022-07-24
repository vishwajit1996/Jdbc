package com.connection.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlDemo {
        public static void main(String []args) throws Exception
        {
        	//load the driver
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	//establish the connection between java application with MySQL database
        	
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
        	//Create Statement
        	Statement st=con.createStatement();
        	//Taking table name dynamically
        	
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("enter the table name :- ");
        	
        	String tname=br.readLine();
        	//Write and Execute query 
        	
        	String query="create table "+tname + " (ENO int(3) primary key, ENAME varchar(5), ESAL float(5))";
        	
        	st.executeUpdate(query);
        	System.out.println( tname + " table created successfullu");
        	
        	//close the connection
        	
        	st.close();
        	con.close();
        	
        			
        }

}