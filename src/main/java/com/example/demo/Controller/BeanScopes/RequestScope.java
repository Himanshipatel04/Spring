package com.example.demo.Controller.BeanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScope {

    private final String requestId = UUID.randomUUID().toString();

    public RequestScope() {
        System.out.println("RequestScopeDemo instance created: " + requestId);
    }

    @GetMapping("/request-scope")
    public String handleRequest() {
        return "This is a request-scoped controller. Instance ID: " + requestId;
    }
}


// Request and Session Scopes

// These scopes are available in web-aware Spring applications, such as Spring Boot applications with Spring MVC.

// Request Scope

// Definition:
// A new bean instance is created for each HTTP request.

// Annotation: @Scope("request")

// Use Case:
// To store request-specific data.




// Singleton beans are created once per application lifecycle.
// Request-scoped beans are created once per HTTP request.
// So if you inject a request-scoped bean directly into a singleton, Spring fails — because it tries to create the request-scoped bean at singleton instantiation time, when there is no HTTP request active.