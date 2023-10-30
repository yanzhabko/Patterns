package org.example;

import org.example.factory.ProductFactory;
import org.example.interfaces.Factory;
import org.example.interfaces.LaptopProduct;
import org.example.interfaces.PcProduct;
import org.example.interfaces.PhoneProduct;

public class Main {
    public static void main(String[] args) {
        Factory factoryPhone = new ProductFactory().createFactory("Phone");
        Factory factoryPC = new ProductFactory().createFactory("PC");
        Factory factoryLaptop = new ProductFactory().createFactory("Laptop");

        PhoneProduct samsungCatalog = factoryPhone.createPhone("Samsung");
        PhoneProduct pixelCatalog = factoryPhone.createPhone("Pixel");
        PhoneProduct iphoneCatalog = factoryPhone.createPhone("Iphone");

        System.out.println("Samsung");
        samsungCatalog.showPhoneCatalog();
        System.out.println("Pixel");
        pixelCatalog.showPhoneCatalog();
        System.out.println("Iphone");
        iphoneCatalog.showPhoneCatalog();

        PcProduct gamingPcCalalog = factoryPC.createPc("Gaming");
        PcProduct oficePcCalalog = factoryPC.createPc("Ofice");

        System.out.println("Ігрові комп'ютери");
        gamingPcCalalog.showPcCatalog();
        System.out.println("Офісні комп'ютери");
        oficePcCalalog.showPcCatalog();

        LaptopProduct gamingLaptop = factoryLaptop.createLaptop("Gaming");
        LaptopProduct oficeLaptop = factoryLaptop.createLaptop("Ofice");

        System.out.println("Ігрові ноутбуки");
        gamingLaptop.showLaptopCatalog();
        System.out.println("Офісні ноутбуки");
        oficeLaptop.showLaptopCatalog();
    }
}
