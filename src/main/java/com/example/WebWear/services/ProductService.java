package com.example.WebWear.services;

import com.example.WebWear.dto.product.ProductRegisterData;
import com.example.WebWear.dto.user.UserGetData;
import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.dto.user.UserUpdateData;
import com.example.WebWear.entity.Product;
import com.example.WebWear.entity.User;
import com.example.WebWear.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void post_product(ProductRegisterData data){
        Product product = new Product();
        productRepository.save(product);
    }

}
