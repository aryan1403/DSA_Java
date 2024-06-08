package com.example.springdemo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

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
}
