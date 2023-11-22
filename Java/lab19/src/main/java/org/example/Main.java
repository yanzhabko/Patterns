package org.example;

public class Main {
    public static void main(String[] args) {
        Consultant roma=new Consultant("Roma Pavliuk","intern",false);
        Consultant vlad=new Consultant("Vlad Kiriliuk","Middle",false);
        Consultant pasha=new Consultant("Pasha Silimonka","Senior",false);
        Consultant masha=new Consultant("Masha Luziv","GrantMaster",false);
        masha.add(new Consultant("Katya","junior",false));
        System.out.println();
        roma.changeStatus();
        System.out.println();
        vlad.remove();
        System.out.println();
        roma.changeStatus();
        System.out.println();
        pasha.remove();
    }
}