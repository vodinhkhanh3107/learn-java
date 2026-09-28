package com.example.demo.java_core.generic;


public class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    // constructor

    // getter

    // setter
    public static <T> void printValue(T value) {
        System.out.println(value);
    }
    
}
