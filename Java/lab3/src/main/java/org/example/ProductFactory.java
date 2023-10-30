package org.example;
public class ProductFactory {
    public Product createCatalog(String product) {
        return switch (product) {
            case "Phone" -> new Phone();
            case "Laptop" -> new Laptop();
            case "PC" -> new PersonalComp();
            default -> null;
        };
    }
}
