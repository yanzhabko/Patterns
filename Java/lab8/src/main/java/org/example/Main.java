package org.example;

import org.example.Interface.Product;
import org.example.Product.Laptop;
import org.example.Product.Pc;
import org.example.Product.Phone;
import org.example.Stage.FirstStage;
import org.example.Stage.SecondStage;
import org.example.Stage.ThisrdStage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Laptop");
        Product laptop = new Laptop(new FirstStage());
        laptop.getInfoAboutStage();
        laptop.setRepairStages(new SecondStage());
        laptop.getInfoAboutStage();
        laptop.setRepairStages(new ThisrdStage());
        laptop.getInfoAboutStage();

        System.out.println("PC");
        Product pc = new Pc(new FirstStage());
        pc.getInfoAboutStage();
        pc.setRepairStages(new SecondStage());
        pc.getInfoAboutStage();
        pc.setRepairStages(new ThisrdStage());
        pc.getInfoAboutStage();

        System.out.println("Phone");
        Product phone = new Phone(new FirstStage());
        phone.getInfoAboutStage();
        phone.setRepairStages(new SecondStage());
        phone.getInfoAboutStage();
        phone.setRepairStages(new ThisrdStage());
        phone.getInfoAboutStage();
    }
}
