package com.example.demo.Controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyBean{
     public LazyBean(){
         System.out.println("Hey i am here in lazy initialization");
     }
}
