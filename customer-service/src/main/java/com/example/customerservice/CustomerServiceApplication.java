package com.example.customerservice;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        try {
            customerRepository.save(new Customer("John", "Doe", "john@email.com"));
            customerRepository.save(new Customer("Marry", "Public", "marry@email.com"));
            customerRepository.save(new Customer("Sent", "DStiffen", "sent@email.com"));
            customerRepository.save(new Customer("Rahul", "Dravid", "rahul@email.com"));
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
