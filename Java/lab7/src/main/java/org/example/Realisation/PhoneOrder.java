package org.example.Realisation;

import org.example.Interface.IPhoneOrder;
public class PhoneOrder implements IPhoneOrder {
    @Override
    public void createPhoneOrder() {
        System.out.println("Your phone's order is complete");
    }
}
