package com.example.customerservice.controller;

import com.example.customerservice.model.Customer;
import com.example.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private Environment environment;
    private CustomerService customerService;
    @Autowired
    public CustomerController(Environment environment,CustomerService customerService) {
        this.environment = environment;
        this.customerService=customerService;
    }

    @RequestMapping("/status")
    public String getStatus()
    {
        return "app is up: "+environment.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
    }
    @GetMapping
    public ResponseEntity<Iterable<Customer>> getAllCustomers()
    {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.fetchAllCustomers());
    }
}
