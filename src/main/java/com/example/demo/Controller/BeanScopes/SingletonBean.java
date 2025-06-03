package com.example.demo.Controller.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean instance created");
    }
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
class SingletonBean2 {
    public SingletonBean2() {
        System.out.println("SingletonBean instance created");
    }
}

@Component
@Scope("singleton")
class SingletonBean3 {
    public SingletonBean3() {
        System.out.println("SingletonBean instance created");
    }
}

// Definition:
// In Spring, the singleton scope means that the Spring container creates only
// one instance of the bean per Spring IoC container. All requests for that bean
// return the same object.
// Default Scope: Yes, singleton is the default scope in Spring.
// Use Case: Shared resources or stateless service beans.