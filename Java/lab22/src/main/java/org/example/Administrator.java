package org.example;

public class Administrator extends WorkerTemplate{
    @Override
    void doWork() {
        System.out.println("I administer in an organization");
    }
    @Override
    void takeOver() {
        System.out.println("I have a break from 13:00 to 14:00");
    }
    @Override
    void continueWork() {
        System.out.println("I continue administer in an organization");
    }

}
