package org.example;

public class Administrator extends WorkerDecorator {
    public Administrator(Worker worker) {
        super(worker);
    }
    public String makeJob(){
        return " Take interviews and keep track of everything";
    }
    @Override
    public String doWork() {
        return super.doWork()+makeJob();
    }
}
