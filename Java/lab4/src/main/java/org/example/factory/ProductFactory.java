package org.example.factory;

import org.example.interfaces.Factory;
public class ProductFactory {
    public Factory createFactory(String typeFactory) {
        return switch (typeFactory) {
            case "Phone" -> new PhoneFactory();
            case "Laptop" -> new LaptopFactory();
            case "PC" -> new PcFactory();
            default -> null;
        };
    }
}
