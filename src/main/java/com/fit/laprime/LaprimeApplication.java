package com.fit.laprime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class LaprimeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaprimeApplication.class, args);
    }

}
