package org.example;

public class Main {
    public static void main(String[] args) {
        Notification juniorNotyfy=new JuniorRepairman(Priority.STANADART);
        Notification middleNotyfy=new MiddleRepairman(Priority.MIDLLE);
        Notification seniorNotyfy=new SeniorRepairmen(Priority.HARD);
        juniorNotyfy.setNext(middleNotyfy);
        middleNotyfy.setNext(seniorNotyfy);
        juniorNotyfy.giveToNextRaopirman("Oops something went wrong",Priority.STANADART);
        System.out.println();
        juniorNotyfy.giveToNextRaopirman("Ith not easy",Priority.MIDLLE);
        System.out.println();
        juniorNotyfy.giveToNextRaopirman("Das ist caput",Priority.HARD);
    }
}