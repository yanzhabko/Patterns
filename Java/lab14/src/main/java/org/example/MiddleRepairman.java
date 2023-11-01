package org.example;

public class MiddleRepairman extends Notification{
    public MiddleRepairman(int prority) {
        super(prority);
    }
    @Override
    public void printMessage(String message) {
        System.out.println("I take it apart and look at some details: "+message);
    }
}
