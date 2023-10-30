package org.example.factory;

import org.example.interfaces.Factory;
import org.example.interfaces.LaptopProduct;
import org.example.interfaces.PcProduct;
import org.example.interfaces.PhoneProduct;
import org.example.laptop.GamingLaptop;
import org.example.laptop.OficeLaptop;

public class LaptopFactory implements Factory {
    public LaptopProduct createLaptop(String typeOfLaptop) {
        return switch (typeOfLaptop) {
            case "Gaming" -> new GamingLaptop();
            case "Ofice" -> new OficeLaptop();
            default -> null;
        };
    }

    @Override
    public PcProduct createPc(String typeOfPc) {
        return null;
    }

    @Override
    public PhoneProduct createPhone(String typeOfPhone) {
        return null;
    }

}
