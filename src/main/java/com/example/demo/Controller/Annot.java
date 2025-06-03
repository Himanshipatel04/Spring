package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class Annot {
    @GetMapping(path = "/fetchUser")
    public String fetchUser(@RequestParam(value = "name") String name,
            @RequestParam(value = "age", required = false) Integer age) {

        return "Hey " + name + ", age : " + age;

    }

    @PostMapping("/saveUser")
    public String setUser() {
        return "Saved";
    }
}
