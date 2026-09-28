package com.example.demo.java_core.exception;

public class ProductService {
    public String findProduct(Long id) {
        if(id == 1L) {
            return "Laptop";
        }
        throw new ProductNotFoundException(
            "Product with id " + id + " not found"
        );

    }

}

