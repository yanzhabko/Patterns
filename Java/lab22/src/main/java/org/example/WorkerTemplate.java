package org.example;

public abstract class WorkerTemplate {
    public void startVariable(){
        System.out.println("Worker start varible");
    }
    public void endVarible(){
        System.out.println("Worker finish varible");
    }

    abstract void doWork();
    abstract void takeOver();
    abstract void continueWork();
    public void showWorkSchedule(){
        startVariable();
        doWork();
        takeOver();
        continueWork();
        endVarible();
    }
}
