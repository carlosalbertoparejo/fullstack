package com.fullstack.swagger.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO para el endpoint de eco")
public record EcoDTO(String eco) {}
