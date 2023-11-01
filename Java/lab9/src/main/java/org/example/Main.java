package org.example;

public class Main {
    public static void main(String[] args) {
        Pc pc=new Pc();
        Pc componentPc=new Pc();
        pc.addComponent(new Cpu("inte i9"));
        pc.addComponent(new Power("fujitsu 600w"));
        pc.addComponent(new Gpu("rx 4090 24gb"));
        pc.addComponent(new Motherboard("Asus"));

        pc.repair();
        componentPc.addComponent(pc);
        componentPc.repair();
    }
}