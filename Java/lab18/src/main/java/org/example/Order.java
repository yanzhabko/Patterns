package org.example;

public class Order {
    private String name;
    private String type;

    public Order(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public Order copy(){
        return new Order(name,type);
    }
}
