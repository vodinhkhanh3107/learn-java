package com.example.demo.java_core.interface_demo;


public class BankPayment implements Payment, Refundable {

    @Override()
    public void pay() {
        System.out.println("Bank payment");
    }

    @Override()
    public void refund() {
        System.out.println("Bank refund");
    }
}