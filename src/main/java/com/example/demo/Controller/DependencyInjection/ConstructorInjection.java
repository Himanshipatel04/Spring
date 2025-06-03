package com.example.demo.Controller.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;

@Component
public class ConstructorInjection {
    private User user;

    @Autowired //Preferred approach in Spring (starting Spring 4.3, @Autowired is optional on a single constructor).
    ConstructorInjection(){
        this.user = new User();
        System.out.println("Dep cons");
    }
}
