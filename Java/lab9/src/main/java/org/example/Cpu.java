package org.example;

public class Cpu implements Component{
    String name;
    public Cpu(String name) {
        this.name = name;
    }
    @Override
    public void repair() {
        System.out.println("We repair "+name);
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                '}';
    }
}
