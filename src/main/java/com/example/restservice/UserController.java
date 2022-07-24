package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("user")
    public String getUser(@RequestParam(value="name", defaultValue = "Mang Tomas") String name, @RequestParam(value = "age") int age){
        return name + age;
    }

}
