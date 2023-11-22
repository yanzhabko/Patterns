package org.example;

public class Main {
    public static void main(String[] args) {
        Order order=new Order("Create pc","create");
        order.setPaymentMethod(new CardPayment());
        order.setPaymentMethod(new CheckPayment());
        order.setPaymentMethod(new CashPayment());
        order.doPayment();
        order.setPaymentMethod(new CheckPayment());
        order.doPayment();
    }
}