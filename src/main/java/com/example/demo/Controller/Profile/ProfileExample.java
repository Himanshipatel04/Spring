package com.example.demo.Controller.Profile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

interface GreetingService {
    String greet();
}

@Configuration
public class ProfileExample {

    @Bean
    @Profile("dev")
    public GreetingService devGreetingService() {
        return () -> "Hello from DEV profile!";
    }

    @Bean
    @Profile("prod")
    public GreetingService prodGreetingService() {
        return () -> "Hello from PROD profile!";
    }
}
