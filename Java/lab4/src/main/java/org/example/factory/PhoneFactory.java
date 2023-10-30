package org.example.factory;

import org.example.interfaces.Factory;
import org.example.interfaces.LaptopProduct;
import org.example.interfaces.PcProduct;
import org.example.interfaces.PhoneProduct;
import org.example.phone.Iphone;
import org.example.phone.Pixel;
import org.example.phone.Samsung;
public class PhoneFactory implements Factory {
    @Override
    public LaptopProduct createLaptop(String typeOfLaptop) {
        return null;
    }
    @Override
    public PcProduct createPc(String typeOfPc) {
        return null;
    }
    public PhoneProduct createPhone(String typeOfPhone) {
        return switch (typeOfPhone) {
            case "Samsung" -> new Samsung();
            case "Iphone" -> new Iphone();
            case "Pixel" -> new Pixel();
            default -> null;
        };
    }
}
