package org.example.phone;

import org.example.interfaces.PhoneProduct;
public class Iphone implements PhoneProduct {
    @Override
    public void showPhoneCatalog() {
        System.out.println("""
                1.IPhone 15 42500грн
                2.IPhone 14 37000грн
                3.IPhone 14 Plus 42000грн
                4.IPhone 11 24000грн
                5.IPhone 13 mini 34000грн
                """);
    }
}
