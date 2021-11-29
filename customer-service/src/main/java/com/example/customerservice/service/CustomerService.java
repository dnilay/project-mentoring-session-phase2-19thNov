package com.example.customerservice.service;

import com.example.customerservice.model.Customer;

public interface CustomerService {

    public Customer createCustomer(Customer customer);
    public Iterable<Customer> fetchAllCustomers();
}
