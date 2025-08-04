package com.example.springannotations;

import com.example.springannotations.repository.UserRepository;
import com.example.springannotations.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAnnotationsApplication.class, args);

        UserService userService = context.getBean(UserService.class);
        userService.print();

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.connect();
    }
}
