package com.example.springannotations.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    @PostConstruct
    public void init() {
        System.out.println("🚀 Bean inicializado com @PostConstruct.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("🧹 Bean será destruído com @PreDestroy.");
    }
}
