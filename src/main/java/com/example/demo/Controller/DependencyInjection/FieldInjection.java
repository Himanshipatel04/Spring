package com.example.demo.Controller.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;

// @Lazy
@Component
public class FieldInjection {
    @Autowired
    private User user; //can't be a local variable

    public void fieldInjection(){
        System.out.println("Dep field");
        // You can use 'user' here
    }
}
