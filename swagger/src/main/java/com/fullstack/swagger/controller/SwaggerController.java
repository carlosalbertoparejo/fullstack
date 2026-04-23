package com.fullstack.swagger.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import com.fullstack.swagger.controller.dto.HelloDTO;
import com.fullstack.swagger.controller.dto.EcoDTO;

@RestController
@RequestMapping("/api")
public class SwaggerController {

    @Operation(
        summary = "Endpoint de saludo",
        description = "Endpoint de prueba",
        responses = {
            @ApiResponse(responseCode = "200", description = "Saludo exitoso")
        }
    )
    @GetMapping("/hello")
    public HelloDTO hello() {
        return new HelloDTO("Hello, Swagger!");
    }

    @Operation(
        summary = "Endpoint de eco",
        description = "Eco de mensaje enviado",
        responses = {
            @ApiResponse(responseCode = "200", description = "Eco exitoso")
        }
    )
    @PostMapping("/echo")
    public EcoDTO echo(@RequestBody String message) {
        return new EcoDTO(message);
    }
}
