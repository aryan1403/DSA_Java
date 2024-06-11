package com.example.springdemo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Models.emp;
import com.example.springdemo.Models.loginModel;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class basicController {
    // Endpoint: http://localhost:8080/
    @GetMapping("/")
    public String welcome() {
        return "Welcome to my Spring application";
    }

    @PostMapping("/postData")
    public String postReqDemo(@RequestBody String name) {
        return name;
    }
    
    @PostMapping("/login")
    public String login(@RequestBody loginModel model) {
        if(model.getEmail().equals("aryan@xyz.com") 
        && model.getPass().equals("123")) {
            return "Login successfull";
        }
        return "Login failed";
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
