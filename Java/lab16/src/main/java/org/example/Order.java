package org.example;

public class Order {
    String name;
    String type;

    public Order(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
