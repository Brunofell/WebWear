package com.example.WebWear.dto.product;

import jakarta.validation.constraints.NotBlank;

public record ProductRegisterData(
        @NotBlank
        String name,
        @NotBlank
        String description,
        @NotBlank
        Integer stock,
        @NotBlank
        String category
) {
}
