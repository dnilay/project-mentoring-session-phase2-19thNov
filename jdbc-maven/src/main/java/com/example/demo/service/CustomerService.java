package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer)throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;

}
