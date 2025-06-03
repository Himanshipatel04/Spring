package com.example.demo.Controller.BeanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Session Scope Notes:
 * 
 * - Definition: A new bean instance is created for each HTTP session.
 * - Annotation: @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
 * - Use Case: Store data related to a user session, such as login info, user preferences, shopping cart, etc.
 * - Works only in web-aware Spring applications with sessions enabled.
 * - Proxy mode is required to inject session-scoped bean into singleton beans/controllers.
 */

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
class SessionScopedBean {

    private final String sessionId = UUID.randomUUID().toString();

    public SessionScopedBean() {
        System.out.println("SessionScopedBean created: " + sessionId);
    }  

    public String getSessionId() {
        return sessionId;
    }
}

@RestController
public class SessionScope {

    private final SessionScopedBean sessionScopedBean;

    // Inject session scoped bean proxy into singleton controller
    public SessionScope(SessionScopedBean sessionScopedBean) {
        this.sessionScopedBean = sessionScopedBean;
    }

    @GetMapping("/session-scope")
    public String getSessionScope() {
        return "SessionScopedBean ID for this session: " + sessionScopedBean.getSessionId();
    }
}
