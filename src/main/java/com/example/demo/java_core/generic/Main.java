
package com.example.demo.java_core.generic;



public class Main {
    public static void main(String[] args) {
        // Box<String> nameBox= new Box<>("khánh");
        // Box<Integer> ageBox= new Box<>(23);
        
        // System.out.println(nameBox.getValue());
        // System.out.println(ageBox.getValue());

        // Box<Product> productBox = new Box<>(
        //     new Product(
        //         1L,
        //         "Laptop",
        //         200000,
        //         20
        //     )
        // );

        // Product product = productBox.getValue();

        // System.out.println(product.getName());
        
        // nameBox.printValue(123);


        // Pair<Long, String> product = new Pair<>(
        //     1L,
        //     "Laptop"
        // );

        // System.out.println(product.getKey());
        // System.out.println(product.getValue());

        ApiResponse<List<Product>> res = new ApiResponse(
            200,
            "Success",
            [
                {
                    "id": 1,
                    "name": "Laptop"
                },
                {
                    "id": 2,
                    "name": "Mouse"
                }
            ]
        );
        
        System.out.println(res);
    }

    

        

}