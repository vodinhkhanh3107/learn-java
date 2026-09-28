
package com.example.demo.java_core.collections;

import java.util.List;
import java.util.Map;


public class ProductService {

    public static void printProducts(List<Product> products) {
        for(Product product : products) {
            System.out.println(product.getName());

        }
    }

    // public static Product findProductById(List<Product> products, Long id) {
    //     for(Product product: products) {
    //         if(product.getId().equals(id)) {
    //             return product;
    //         }
    //     }
    //     throw new ProductNotFoundException(
    //         "Product with id " + id + " not found"
    //     );
    // }

    public static Product findProductById(
            Map<Long, Product> products,
            Long id
    ) {
        boolean productExist = products.containsKey(id);
        if(productExist) return (products.get(id));
        return null;
    }

    public static int UpdateQuantityProduct(
            Map<Long, Product> products,
            Long id,
            Product proUpdate
    ) {
        products.put(id,proUpdate);
        return proUpdate.getQuantity();
    }

    
}