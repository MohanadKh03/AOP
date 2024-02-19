package com.example.aop.test.inner;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlablaController {
    @GetMapping("/blabla")
    String blabla(){
        System.out.println("HERE INSIDE FUNCTION");
        return "blabla";
    }

    @GetMapping("/another-blabal")
    ResponseEntity<String>anotherBlabla(){
        return new ResponseEntity<>("another-blabla", HttpStatusCode.valueOf(200));
    }

}
