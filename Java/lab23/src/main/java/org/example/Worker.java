package org.example;

public class Worker implements IWorker{
    @Override
    public void doConsultation() {
        System.out.println("Worker consults clients");
    }

    @Override
    public void createOrder() {
        System.out.println("Worker crates order");
    }
}
