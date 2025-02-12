package com.example.WebWear.dto.product;

public record ProductUpdateData(
        Long id,
        String name,
        String description,
        Integer stock,
        String category
) {

}
