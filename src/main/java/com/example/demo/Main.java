package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo"}) // Default scan starts from com.example.demo and sub-packages
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}