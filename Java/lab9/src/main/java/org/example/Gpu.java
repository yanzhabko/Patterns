package org.example;

public class Gpu implements Component{
    String name;
    public Gpu(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Gpu{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void repair() {
        System.out.println("We repair "+name);
    }
}
