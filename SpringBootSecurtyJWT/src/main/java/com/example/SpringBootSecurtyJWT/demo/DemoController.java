package com.example.SpringBootSecurtyJWT.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth/demo-controller")
public class DemoController {

    @GetMapping
    ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello JWT");
    }
}
