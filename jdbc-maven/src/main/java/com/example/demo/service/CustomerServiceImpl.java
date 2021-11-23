package com.example.demo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.factory.MyConnectionFactory;
import com.example.demo.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private Connection connection = null;

	public CustomerServiceImpl() throws SQLException {
		connection = MyConnectionFactory.getMyConnection();
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("insert into customer(id,customer_name,customer_email) values(?,?,?)");
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getCustomerName());
		preparedStatement.setString(3, customer.getCustomerEmail());
		preparedStatement.executeUpdate();
		
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		Statement statement=connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from customer");
		
		List<Customer> list=new ArrayList<Customer>();
		
		while(resultSet.next())
		{
			list.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
		}
		
		return list;
		
	}

}
