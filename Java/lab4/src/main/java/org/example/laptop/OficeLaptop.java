package org.example.laptop;

import org.example.interfaces.LaptopProduct;
public class OficeLaptop implements LaptopProduct {
    @Override
    public void showLaptopCatalog() {
        System.out.println("""
                1. ASUS Vivobook 15 17000грн
                2. Apple MacBook Air 13 43500грн
                3. HP Laptop 15s-eq2052ua 12000грн
                4. HP 250 G9 11000грн
                5. ASUS X515EA 13000грн
                """);
    }
}
