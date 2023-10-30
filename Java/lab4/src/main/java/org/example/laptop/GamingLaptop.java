package org.example.laptop;

import org.example.interfaces.LaptopProduct;
public class GamingLaptop implements LaptopProduct {
    @Override
    public void showLaptopCatalog() {
        System.out.println("""
                1. Acer Aspire 7 32000грн
                2. Lenovo IdeaPad Slim 5 27000грн
                3. ASUS ROG Strix G16 58000грн
                4. GIGABYTE G5 MF 3900грн
                5. Lenovo IdeaPad Gaming 3 12000грн
                """);
    }
}
