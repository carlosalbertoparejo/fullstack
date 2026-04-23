package com.fullstack.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Demo Swagger para master ediae",
        version = "1.0",
        description = "prueba para master ediae para ver como funciona"
    )
)
@SpringBootApplication
public class DemoswaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoswaggerApplication.class, args);
    }
}
