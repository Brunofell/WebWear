package com.example.WebWear.dto.user;

public record UserUpdateData(
        Long id,
        String name,
        String email,
        String password,
        String postalCode,
        String phone_number,
        String date
) {
}
