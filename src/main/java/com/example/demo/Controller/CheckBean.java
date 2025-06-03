package com.example.demo.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckBean {

    @Autowired
    LazyBean lazyBean;

    @PostConstruct
    public void show(){
        System.out.println("Hey i am here after construct");
    }

    @PreDestroy
    public void display(){
        System.out.println("Hey i am here before deletion");
    }

   public CheckBean(){
       System.out.println("hey eager initialization");
   }
}
