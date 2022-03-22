package com.sasageyo.assignmentsasageyo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AssignmentsasageyoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentsasageyoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "<h1>hello world!";
    }
}
