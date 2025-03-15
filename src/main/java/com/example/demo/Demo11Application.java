package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo11Application {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo11Application.class, args);
    }

}
