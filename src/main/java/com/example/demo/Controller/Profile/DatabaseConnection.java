package com.example.demo.Controller.Profile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;


@Profile("prod")
@Component
public class DatabaseConnection {

    @Value("${username}")
    private String dbUsername;

    @Value("${password}")
    private String dbPassword;

    @PostConstruct
    public void init(){
        System.out.println(dbUsername+" "+dbPassword);
    }
}


//dynamically 
// mvn spring-boot:run-Dspring-boot.run.profiles=prod
//mvn spring-boot:run-Pprod //in profile