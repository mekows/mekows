package com.example.mekows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.mekows")
@EntityScan(basePackages = "com.example.mekows")
public class MekowsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MekowsApplication.class, args);
    }
}
