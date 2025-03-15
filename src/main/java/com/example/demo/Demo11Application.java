package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@SpringBootApplication
@RestController
public class Demo11Application {

    private final StudentRepository studentRepository;

    public Demo11Application(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("/welcome")
    public List<Student> welcome() {
        return studentRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo11Application.class, args);
    }

}
