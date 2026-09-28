package com.example.demo.java_core.collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        Product pro1 = new Product(
            1L,
            "Laptop",
            200000000,
            22
        );
        Product pro2 = new Product(
            2L,
            "Mouse",
            500000,
            10
        );
        Product pro3 = new Product(
            1L,
            "Laptop",
            200000000,
            22
        );


        // List<Product> products = new ArrayList<>();

        // products.add(pro1);
        // products.add(pro2);
        // products.add(pro3);

        // ProductService.printProducts(products);


        // ProductService ps = new ProductService();
        // // Product productExist = ps.findProductById(products, 10L);
        // // if(productExist != null) System.out.println(productExist.getName());

        // try {
        //     Product productExist = ps.findProductById(products, 99L);
        //     System.out.println(productExist.getName());
        // }
        // catch (ProductNotFoundException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println(products.get(0).getName());
        // products.get(1).setName("Monitor");
        // System.out.println(products.get(1).getName());

        // System.out.println(products.size());

        // System.out.println(products.get(1).getName());
        
        // products.remove(1);
     
        // System.out.println(products.get(1).getName());

        // System.out.println(products.size());

        // Set<Product> productSets = new HashSet<>();

        // productSets.add(pro1);
        // productSets.add(pro2);
        // productSets.add(pro3);

        // System.out.println(pro1 == pro3);
        // System.out.println(pro1.equals(pro3));


        // System.out.println(products.size());
        // System.out.println(productSets);

        // System.out.println(productSets.size());


        Map<Long, Product> productMaps = new HashMap<>();
        productMaps.put(1L,pro1);
        productMaps.put(2L,pro2);
        productMaps.put(3L,pro3);
        
        
        System.out.println(productMaps);
        System.out.println(productMaps.size());

        System.out.println(productMaps.get(1L));
        // System.out.println(productMaps.containsKey(5L));

        ProductService ps = new ProductService();

        // try{
        //     Product productFindByIdExist = ps.findProductById(productMaps,1l);    
        //     System.out.println(productFindByIdExist);
            

        // }

        // catch(ProductNotFoundException e) {
        //     System.out.println(e.getMessage());
        // }

        Product proUpdate = new Product(
            1L,
            "Laptop",
            200000000,
            15
        );

        System.out.println(ps.UpdateQuantityProduct(productMaps,1L,proUpdate));

    }
}