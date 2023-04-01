package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerController {

    @Value("${say.hello}")
    private String hello;

    @Value("${my.name}")
    private String name;

    @Value("${dog.name}")
    private String dog;

    @GetMapping("/hello")
    String name(){
        return hello;
    }

    @GetMapping("/dog")
    String dogName(){
        return dog;
    }

    @GetMapping("/name")
    String myName(){
        return name;
    }
}
