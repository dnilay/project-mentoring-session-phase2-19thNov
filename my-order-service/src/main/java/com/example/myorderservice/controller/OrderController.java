package com.example.myorderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {


    private Environment environment;

    @Autowired
    public OrderController(Environment environment) {
        this.environment = environment;
    }
    @GetMapping("/status")
    public ResponseEntity<?> getStatus()
    {
        return ResponseEntity.ok("order-ws is up and running on port: "+environment.getProperty("local.server.port"));
    }
}
