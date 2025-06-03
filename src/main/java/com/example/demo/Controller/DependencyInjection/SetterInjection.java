package com.example.demo.Controller.DependencyInjection;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;

@Component
public class SetterInjection {
    private User user;

    public void setUser(){
          this.user = new User();
          System.out.println("Dep setter");
    }
}
