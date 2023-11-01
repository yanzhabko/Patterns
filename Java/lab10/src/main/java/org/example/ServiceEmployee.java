package org.example;

public class ServiceEmployee extends WorkerDecorator {
    public ServiceEmployee(Worker worker) {
        super(worker);
    }
    public String makeJob(){
        return " Repair devices.";
    }
    @Override
    public String doWork() {
        return super.doWork()+makeJob();
    }
}
