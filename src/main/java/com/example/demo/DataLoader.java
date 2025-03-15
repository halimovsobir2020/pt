package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class DataLoader implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public DataLoader(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(
                new Student("a")
        );
    }
}
