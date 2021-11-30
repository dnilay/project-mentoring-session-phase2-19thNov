package com.example.myorderservice.controller;

import com.example.myorderservice.model.Order;
import com.example.myorderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {


    private final Environment environment;
    private final OrderService orderService;
    @Autowired
    public OrderController(Environment environment,OrderService orderService) {
        this.environment = environment;
        this.orderService = orderService;
    }
    @GetMapping("/status")
    public ResponseEntity<?> getStatus()
    {
        return ResponseEntity.ok("order-ws is up and running on port: "+environment.getProperty("local.server.port"));
    }

    @PostMapping("/")
    public ResponseEntity<Order> createOrder(@RequestBody Order order)
    {
        Order tempOrder=orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(tempOrder);
    }
}
