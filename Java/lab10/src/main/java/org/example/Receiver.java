package org.example;

public class Receiver extends WorkerDecorator {
    public Receiver(Worker worker) {
        super(worker);
    }
    public  String makeJob(){
        return " Create order.";
    }
    @Override
    public String doWork() {
        return super.doWork()+makeJob();
    }
}
