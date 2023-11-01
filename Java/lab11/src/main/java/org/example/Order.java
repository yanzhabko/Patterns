package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private final String nameOrder;
    private final String typeOfOrder;
    public Order(String nameOrder, String typeOfOrder) {
        this.nameOrder = nameOrder;
        this.typeOfOrder = typeOfOrder;
    }
    public  void createOrder(){
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(nameOrder+","+typeOfOrder+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
