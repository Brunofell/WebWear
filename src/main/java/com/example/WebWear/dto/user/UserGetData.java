package com.example.WebWear.dto.user;

import com.example.WebWear.entity.User;
import jakarta.validation.constraints.NotBlank;

public record UserGetData(
        Long id,
        String name,
        String email,
        String postalCode,
        String phone_number,
        String date
) {
    public UserGetData(User user){
        this(user.getId(), user.getName(), user.getEmail(), user.getDate(), user.getPostalCode(), user.getPhone_number());
    }
}
