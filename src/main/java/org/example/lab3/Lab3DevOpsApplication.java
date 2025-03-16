package org.example.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Lab3DevOpsApplication {

    @GetMapping("/get")
    public String getMessage() {
        return "Hello World, Welcome to Lab3!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab3DevOpsApplication.class, args);
    }

}
