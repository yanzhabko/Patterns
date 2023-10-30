package org.example.phone;

import org.example.interfaces.PhoneProduct;
public class Pixel implements PhoneProduct {
    @Override
    public void showPhoneCatalog() {
        System.out.println("""
                1.Google Pixel 7 22000грн
                2.Google Pixel 7a 17000грн
                3.Google Pixel 6a 13000грн
                4.Google Pixel 7Pro 31400грн
                5.Google Pixel 6 19300грн
                """);
    }
}
