package org.example.phone;

import org.example.interfaces.PhoneProduct;
public class Samsung implements PhoneProduct {
    @Override
    public void showPhoneCatalog() {
        System.out.println("""
                1.Samsung Galaxy A34 15000грн
                2.Samsung Galaxy A14 7000грн
                3.Samsung Galaxy A24 9000грн
                4.Samsung Galaxy S22 27400грн
                5.Samsung Galaxy A53 17300грн
                """);
    }
}
