package com.example.WebWear.dto.product;

import com.example.WebWear.entity.Product;

public record ProductGetData(
        Long id,
        String name,
        double description,
        int stock,
        int category
) {
    public ProductGetData(Product product){
        this(product.getId(), product.getName(), product.getDescription(), product.getStock(), product.getCategory());
    }
}
