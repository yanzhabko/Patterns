package org.example;

public class Main {
    public static void main(String[] args) {
        ControllSystem controllSystem=new ControllSystem(new Order("phone","repair"));
        controllSystem.saveOrderToMemento();

        controllSystem.setOrder("pc","create");
        controllSystem.saveOrderToMemento();

        controllSystem.restoreVersionFromMemento(1);
        System.out.println(controllSystem.getOrder());
        System.out.println();
        controllSystem.restoreVersionFromMemento(2);
        System.out.println(controllSystem.getOrder());
    }
}