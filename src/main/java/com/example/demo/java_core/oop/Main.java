
package com.example.demo.java_core.oop;

public class Main {

    public static void main(String[] args) {

        // User user = new User(
        //         1L,
        //         "Khanh",
        //         "khanh@gmail.com"
        // );

        // System.out.println(user.getName());

        // user.setName("Nguyen Khanh");

        // System.out.println(user.getName());


        // Product pro = new Product(
        //     1L,
        //     "Laptop",
        //     20000000,
        //     2
        // );


        // pro.setName("PC");
        // pro.setPrice(-1000);

        // System.out.println(pro.getName());

        Dog dog = new Dog("Husky");
        dog.bark();
        dog.eat();
        
        Developer dev = new Developer(
            1L,
            "khánh",
            200000,
            "Java"
        );

        System.out.println(dev);
        dev.work();
        System.out.println(dev.getName());
        System.out.println(dev.getSalary());  
        System.out.println(dev.getProgrammingLanguage());

        // Employee employee = new Developer(
        //         1L,
        //         "Khanh",
        //         20000000,
        //         "Java"
        // );
        // employee.work();
        
    }
}