package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_name")
    String username;
    String email;

    public String getName(){
        return this.username;
    }
    public void setName(String username){
         this.username = username;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
       this.email = email;
    }

}
