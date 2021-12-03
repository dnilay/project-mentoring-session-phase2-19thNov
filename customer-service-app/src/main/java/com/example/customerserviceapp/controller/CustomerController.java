package com.example.customerserviceapp.controller;

import com.example.customerserviceapp.document.Customer;
import com.example.customerserviceapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
    }
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomerList()
    {
        return ResponseEntity.ok(customerService.getCustomerList());
    }
}
