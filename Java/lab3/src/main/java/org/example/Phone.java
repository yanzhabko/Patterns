package org.example;

public class Phone implements Product {
    @Override
    public void getProduct() {
        System.out.println("""
                1. Iphone15 40000грн
                2. Samsung S23 34000грн
                3. Pixel 7A 17200грн
                4. Poco 42500грн
                5. OnePlus Nord 12000грн
                """);
    }
}
