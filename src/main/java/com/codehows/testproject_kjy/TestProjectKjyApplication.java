package com.codehows.testproject_kjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TestProjectKjyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectKjyApplication.class, args);
    }

}
