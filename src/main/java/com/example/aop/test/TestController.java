package com.example.aop.test;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    String hello(){
        System.out.println("before the controller");
        return "Hello";
    }

    @GetMapping("/another-hello")
    ResponseEntity<String> anotherHello(){
        return new ResponseEntity<>("Another hello", HttpStatusCode.valueOf(200));
    }

}
