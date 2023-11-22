package org.example;

public class Consultation implements Job{
    @Override
    public void doJob(IWorker worker) {
        worker.doConsultation();
    }
}
