


package com.example.demo.java_core.exception;


public class Main {
    public static void main(String[] args) {
        ProductService pr = new ProductService();

        try{
            String product = pr.findProduct(2L);
            System.out.println(product);
        }

        catch(ProductNotFoundException e) {
            System.out.println(e.getMessage());

        }
    }
}