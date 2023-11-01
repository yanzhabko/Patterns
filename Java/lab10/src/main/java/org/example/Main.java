package org.example;

public class Main {
    public static void main(String[] args) {
        Worker worker=new Administrator(new ServiceEmployee(new Receiver(new StandartWorker())));
        System.out.println(worker.doWork());
        System.out.println("Hello world!");
    }
}