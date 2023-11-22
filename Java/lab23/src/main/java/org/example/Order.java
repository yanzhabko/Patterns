package org.example;

public class Order implements Job {
    String name;
    String type;

    public Order(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void doJob(IWorker worker) {
        worker.createOrder();
        System.out.println("Order: "+name+", type: "+type+" created");
    }
}
