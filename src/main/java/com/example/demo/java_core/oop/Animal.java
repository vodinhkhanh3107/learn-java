package com.example.demo.java_core.oop;

public class Animal {
    protected String name;

    public Animal(
        String name
    ) {
        this.name = name;
    }

    

    public void eat() {
        System.out.println("Animal is eating");

    }


}


class Dog extends Animal {
    
    @Override() 
    public void eat() {
        super.eat();
        System.out.println("Woof");
    }
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}





