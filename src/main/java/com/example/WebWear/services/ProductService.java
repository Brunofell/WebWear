package com.example.WebWear.services;

import com.example.WebWear.dto.product.ProductGetData;
import com.example.WebWear.dto.product.ProductRegisterData;
import com.example.WebWear.dto.product.ProductUpdateData;
import com.example.WebWear.entity.Product;
import com.example.WebWear.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void post_product(ProductRegisterData data){
        Product product = new Product(data);
        productRepository.save(product);
    }

    @Transactional
    public List<ProductGetData> getProduct(){
        return  productRepository.findAll().stream().map(ProductGetData::new).toList();
    }

    @Transactional
    public void update_product(ProductUpdateData data){
        var product = productRepository.getReferenceById(data.id());
        product.update(data);
    }

    @Transactional
    public void delete_product(Long id){
        productRepository.deleteById(id);
    }



}
