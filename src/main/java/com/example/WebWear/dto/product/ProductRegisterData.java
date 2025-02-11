package com.example.WebWear.dto.product;

import jakarta.validation.constraints.NotBlank;

public record ProductRegisterData(
        @NotBlank
        String name,
        @NotBlank
        double description,
        @NotBlank
        int stock,
        @NotBlank
        int categorie
) {
}
