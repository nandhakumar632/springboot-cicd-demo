package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hellooooooooooo");
        return "Hello CI/CD/MY NAME IS NANDHA KUMAR";
    }
}
