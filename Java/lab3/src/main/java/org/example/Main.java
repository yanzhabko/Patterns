package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductFactory().createCatalog("Laptop");
        Product pcProduct = new ProductFactory().createCatalog("PC");
        Product phoneProduct = new ProductFactory().createCatalog("Phone");

        product.getProduct();
        pcProduct.getProduct();
        phoneProduct.getProduct();
    }
}
