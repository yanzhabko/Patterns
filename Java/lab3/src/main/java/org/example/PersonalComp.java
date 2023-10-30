package org.example;

public class PersonalComp implements Product {
    @Override
    public void getProduct() {
        System.out.println("""
                1. Збірка Nexus 22500грн
                2. Збірка Cyclope Limited 30000грн
                3. Збірка Optimum 22000грн
                4. Збірка Mega 42500грн
                5. Збірка Phoenix 17000грн
                """);
    }
}
