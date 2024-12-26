package com.example.WebWear.dto.user;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record UserRegisterData(
        @NotBlank
        String name,
        @NotBlank
        String email,
        @NotBlank
        String password,
        @NotBlank
        String postalCode,
        @NotBlank
        String phone_number,
        @NotBlank
        String date


) {
}
