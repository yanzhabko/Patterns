package org.example.interfaces;

import org.example.factory.PcFactory;
import org.example.factory.PhoneFactory;
public interface Factory {
    LaptopProduct createLaptop(String typeOfLaptop);
    PcProduct createPc(String typeOfPc);
    PhoneProduct createPhone(String typeOfPhone);
}
