package com.example.onlinebusbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinebusbookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlinebusbookingApplication.class, args);
    }

    // You can use @Test from the testing framework
    @org.junit.jupiter.api.Test // Make sure to import the correct JUnit version
    void contextLoads() {
    }
}