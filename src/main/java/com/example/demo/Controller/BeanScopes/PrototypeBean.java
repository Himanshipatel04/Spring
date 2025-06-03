package com.example.demo.Controller.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean instance created");
    }
}



// PrototypeBean demonstrates the "prototype" scope in Spring.

// Definition:
// A new bean instance is created each time it is requested from the container.

// Use Case:
// Useful for stateful beans or when multiple instances are needed independently.

// Note:
// Unlike singleton, Spring does NOT manage the complete lifecycle of prototype beans.
// It only creates and injects them but doesn't call destroy methods.
//Lazily Initialized.