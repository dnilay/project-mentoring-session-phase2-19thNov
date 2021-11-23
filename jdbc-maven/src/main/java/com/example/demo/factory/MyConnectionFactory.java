package com.example.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {
	
	private static Connection connection;
	
	
	public static Connection getMyConnection() throws SQLException
	{
		//step-1 register the driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//step-2 establish the connection
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
		return connection;
	}
	

}
