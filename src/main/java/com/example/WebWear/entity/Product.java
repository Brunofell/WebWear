package com.example.WebWear.entity;

import com.example.WebWear.dto.product.ProductGetData;
import com.example.WebWear.dto.product.ProductRegisterData;
import com.example.WebWear.dto.product.ProductUpdateData;
import com.example.WebWear.dto.user.UserUpdateData;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "product")
@Entity(name = "Product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer stock;
    private String category;

    public Product(ProductRegisterData data){
        this.name = data.name();
        this.description = data.description();
        this.stock = data.stock();
        this.category = data.category();
    }

    public void update(ProductUpdateData data) {
        if(data.name() != null){
            this.name= data.name();
        }
        if(data.description() != null){
            this.description = data.description();
        }
        if(data.stock() != null){
            this.stock = data.stock();
        }
        if(data.category() != null){
            this.category = data.category();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
