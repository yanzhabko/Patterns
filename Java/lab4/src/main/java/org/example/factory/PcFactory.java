package org.example.factory;

import org.example.interfaces.Factory;
import org.example.interfaces.LaptopProduct;
import org.example.interfaces.PcProduct;
import org.example.interfaces.PhoneProduct;
import org.example.pc.GamingPc;
import org.example.pc.OficePc;
public class PcFactory implements Factory {
    @Override
    public LaptopProduct createLaptop(String typeOfLaptop) {
        return null;
    }
    public PcProduct createPc(String typeOfPc) {
        return switch (typeOfPc) {
            case "Gaming" -> new GamingPc();
            case "Ofice" -> new OficePc();
            default -> null;
        };
    }
    @Override
    public PhoneProduct createPhone(String typeOfPhone) {
        return null;
    }
}
