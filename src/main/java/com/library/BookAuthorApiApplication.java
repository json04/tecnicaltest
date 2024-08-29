package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.library.domain.model")
@EnableJpaRepositories("com.library.repository")
public class BookAuthorApiApplication {

     public static void main(String[] args) {
        SpringApplication.run(BookAuthorApiApplication.class, args);
    }
}
