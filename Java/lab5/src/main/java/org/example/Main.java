package org.example;
public class Main {
    public static void main(String[] args) {
        Orders orders = Orders.builder()
                .name("Name")
                .lastName("Name")
                .typeOfDevice("PC")
                .cpu("I9-7300")
                .gpu("RX 550")
                .hhd("1T")
                .power("600W")
                .motherboard("Asus")
                .rom("8Gb")
                .build();

        System.out.println(orders);

        Orders orders1 = Orders.builder()
                .name("Name")
                .lastName("Name")
                .cpu("I9-11000")
                .gpu("RX 4050")
                .ssd("1T")
                .power("600W")
                .motherboard("Asus")
                .rom("8Gb")
                .build();

        System.out.println(orders1);

        System.out.println("Hello world!");
    }
}
