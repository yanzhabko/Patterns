package org.example;

public class JuniorRepairman extends Notification{
    public JuniorRepairman(int prority) {
        super(prority);
    }
    @Override
    public void printMessage(String message) {
        System.out.println("I scan device and something simple to repair it: "+message);
    }
}
