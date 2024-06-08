package com.example.springdemo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Models.emp;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class basicController {
    // Endpoint: http://localhost:8080/
    @GetMapping("/")
    public String welcome() {
        return "Welcome to my Spring application";
    }

    @GetMapping("/home")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/about")
    public String about() {
        return "About Page";
    }

    @GetMapping("/emp")
    public emp getEmp() {
        emp e = new emp();
        e.setId(UUID.randomUUID().toString());
        e.setName("Aaryan");
        e.setSalary(600000);
        e.setRole("Trainer");
        return e;
    }
}
