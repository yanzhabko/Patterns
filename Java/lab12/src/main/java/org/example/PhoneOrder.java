package org.example;

public class PhoneOrder {
    String name;
    public PhoneOrder(String name) {
        this.name = name;
    }
    public void createPhoneOrder(){
        System.out.println("Phone order for "+name+" created");
    }
}
