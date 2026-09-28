package com.example.demo.java_core.interface_demo;


public class CashPayment implements Payment {

    @Override()
    public void pay() {
        System.out.println("Cash payment");
    }
}