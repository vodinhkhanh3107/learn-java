package com.example.demo.java_core.oop;
public class Product {
    private Long id ;
    private String name;
    private double price;
    private int quantity;

    public Product (
        Long id,
        String name,
        double price,
        int quantity
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}