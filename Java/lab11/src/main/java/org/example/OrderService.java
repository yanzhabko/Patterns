package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OrderService {
    Order order;
    boolean free;
    public OrderService(Order order) {
        this.order = order;
    }
    public void makeOrder(){
        StringBuilder text= new StringBuilder();
        try(FileInputStream read = new FileInputStream("orders.txt")) {
            Scanner scan = new Scanner(read);
            while (scan.hasNextLine()) {
                text.append(scan.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        free= text.length() > 5;
        if(free){
            order.createOrder();
            System.out.println("your order create");
        }else {
            System.out.println("Ops, something went wrong");
        }
    }
}
