package org.example;

public class Power implements Component{
    String name;
    public Power(String name) {
        this.name = name;
    }
    @Override
    public void repair() {
        System.out.println("We repair "+name);
    }

}
