package org.example;

public class Main {
    public static void main(String[] args) {
        OrderService orderService=new OrderService(new Order("phone","repair"));
        orderService.makeOrder();
    }
}