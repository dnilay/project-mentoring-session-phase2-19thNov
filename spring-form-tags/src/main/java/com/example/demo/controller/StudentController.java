package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    public String home()
    {
        return "index";
    }

    @GetMapping("/showForm")
    public String showForm(Model theModel)
    {
        theModel.addAttribute("student",new Student());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent)
    {
        return "student-confirmation";
    }
}
