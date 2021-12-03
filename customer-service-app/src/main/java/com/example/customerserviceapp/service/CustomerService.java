package com.example.customerserviceapp.service;

import com.example.customerserviceapp.document.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createCustomer(Customer customer);
    public List<Customer> getCustomerList();
}
