package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController() {
        System.out.println("HelloController created");
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }
}