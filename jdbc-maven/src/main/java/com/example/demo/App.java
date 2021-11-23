package com.example.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.factory.MyConnectionFactory;
import com.example.demo.model.Customer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=MyConnectionFactory.getMyConnection();
			Statement statement=connection.createStatement();
			ResultSet resultSet= statement.executeQuery("select * from customer");
			
			List<Customer> list=new ArrayList<Customer>();
			
			while(resultSet.next())
			{
				list.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
			}
			
			for(Customer customer:list)
			{
				System.out.println(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
