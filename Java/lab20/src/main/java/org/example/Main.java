package org.example;

public class Main {
    public static void main(String[] args) {
        Consultant consultant=new Consultant();
        consultant.setActivity(new Advise());
        consultant.doWork();
        consultant.changeActivity();
        consultant.doWork();
        consultant.changeActivity();
        consultant.doWork();
        consultant.changeActivity();
        consultant.doWork();
        consultant.changeActivity();
        consultant.doWork();
    }
}