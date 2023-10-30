package org.example;

public class Laptop implements Product {

    @Override
    public void getProduct() {
        System.out.println("""
                1. Acer Aspire 7 32000грн
                2. Lenovo IdeaPad Slim 5 27000грн
                3. ASUS Vivobook 15 17000грн
                4. Apple MacBook Air 13 43500грн
                5. HP Laptop 15s-eq2052ua 12000грн
                """);
    }
}
