package com.example.mekows;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @RequestMapping("/hello")
    public  String hello(){
        return "Hello SpringBoot";
    }
}
