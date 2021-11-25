package com.example.demo.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private Environment environment;

    private final Logger logger= LoggerFactory.getLogger(HomeController.class);
    @Autowired
    public HomeController(Environment environment) {
        this.environment = environment;
    }
    @RequestMapping("/")
    public String sayHello()
    {
        logger.info(environment.getProperty("local.server.port"));
        return "hello";
    }
}
