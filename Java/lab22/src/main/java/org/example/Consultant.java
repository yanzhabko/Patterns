package org.example;

public class Consultant extends WorkerTemplate{
    @Override
    void doWork() {
        System.out.println("I help clients");
    }

    @Override
    void takeOver() {
        System.out.println("I have a break from 13:00 to 14:00");
    }

    @Override
    void continueWork() {
        System.out.println("I continue help clients");
    }
}
