package org.example;

public class Main {
    public static void main(String[] args) {
        Job consultation=new Consultation();
        Job order=new Order("Iphone","repair");
        consultation.doJob(new Worker());
        System.out.println();
        order.doJob(new Worker());
    }
}