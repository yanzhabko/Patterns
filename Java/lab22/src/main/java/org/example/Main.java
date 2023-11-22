package org.example;

public class Main {
    public static void main(String[] args) {
        WorkerTemplate administrator=new Administrator();
        WorkerTemplate consultant=new Consultant();
        WorkerTemplate cleaner=new Cleaner();
        administrator.showWorkSchedule();
        System.out.println();
        consultant.showWorkSchedule();
        System.out.println();
        cleaner.showWorkSchedule();
    }
}