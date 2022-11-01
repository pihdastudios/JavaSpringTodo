package com.example.javaspringtodo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI custom(@Value("Java Spring Based Todo REST API") String appDescription, @Value("v1.0.0") String appversion) {
        return new OpenAPI().info(new Info()
                .title("Java Spring Based Todo REST API")
                .version(appversion)
                .description(appDescription)
                .termsOfService("https://swagger.io/terms")
                .license(new License()
                        .name("Apache 2.0")
                        .url("https://springdocs.org")));
    }
}
