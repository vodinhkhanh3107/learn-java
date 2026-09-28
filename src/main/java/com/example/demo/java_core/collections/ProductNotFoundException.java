package com.example.demo.java_core.collections;


public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException (String message) {
        super(message);
    }
}