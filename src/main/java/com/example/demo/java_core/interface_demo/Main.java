package com.example.demo.java_core.interface_demo;


public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CashPayment();

        Payment payment2 = new BankPayment();

        payment1.pay();
        payment2.pay();


        BankPayment bp = new BankPayment();
        bp.refund();
    }
}