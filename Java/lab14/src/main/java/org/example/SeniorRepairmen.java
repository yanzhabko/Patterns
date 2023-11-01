package org.example;

public class SeniorRepairmen extends Notification{
    public SeniorRepairmen(int prority) {
        super(prority);
    }
    @Override
    public void printMessage(String message) {
        System.out.println("It`s very hard, senior try repair: "+message);
    }
}
