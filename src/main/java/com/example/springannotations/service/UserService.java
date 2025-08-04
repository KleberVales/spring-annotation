package com.example.springannotations.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void print() {
        System.out.println("✅ UserService executando lógica de serviço.");
    }
}
