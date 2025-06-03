package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PathVariableDemo {

    @GetMapping(path = "/pathUser/{username}")
    public String returnUser(@PathVariable(value = "username") String username){
        return "Hello "+username;
    }
}
