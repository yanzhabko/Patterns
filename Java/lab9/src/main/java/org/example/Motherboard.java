package org.example;

public class Motherboard implements Component{
    String name;
    public Motherboard(String name) {
        this.name = name;
    }

    @Override
    public void repair() {
        System.out.println("We repair "+name);
    }
}
