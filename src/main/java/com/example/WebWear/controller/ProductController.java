package com.example.WebWear.controller;

import com.example.WebWear.dto.product.ProductGetData;
import com.example.WebWear.dto.product.ProductRegisterData;
import com.example.WebWear.dto.product.ProductUpdateData;
import com.example.WebWear.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/register")
    public void post_user(@RequestBody @Valid ProductRegisterData data){
        service.post_product(data);
    }

    @GetMapping("/get")
    public List<ProductGetData> get_user(){
        return service.getProduct();
    }

    @PutMapping("/update")
    public void update_product(@RequestBody @Valid ProductUpdateData data){
        service.update_product(data);
    }

    @DeleteMapping("/delete")
    public void delete_user(Long id){
        service.delete_product(id);
    }

}
