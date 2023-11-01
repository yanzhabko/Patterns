package org.example;

public abstract class Notification {
    private final int prority;
    private Notification next;

    public Notification(int prority) {
        this.prority = prority;
    }

    public void setNext(Notification next) {
        this.next = next;
    }
    public void giveToNextRaopirman(String message, int level){
        if(level>=prority){
            printMessage(message);
        }

        if(next!=null){
            next.giveToNextRaopirman(message,level);
        }
    }
    public abstract void printMessage(String message);
}
