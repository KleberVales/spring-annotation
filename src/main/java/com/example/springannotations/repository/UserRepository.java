package com.example.springannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void connect() {
        System.out.println("📦 Conectando ao repositório de dados.");
    }
}
