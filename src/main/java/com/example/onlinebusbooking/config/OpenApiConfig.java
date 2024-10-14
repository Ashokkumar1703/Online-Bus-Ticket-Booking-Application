package com.example.onlinebusbooking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public org.springdoc.core.GroupedOpenApi publicApi() {
        return org.springdoc.core.GroupedOpenApi.builder()
                .group("public-api")
                .pathsToMatch("/**") // Include all paths, or specify your controllers
                .build();
    }
}