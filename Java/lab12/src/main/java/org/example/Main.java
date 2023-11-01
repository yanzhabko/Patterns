package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneOrderFactory phoneOrderFactory =new PhoneOrderFactory();
        List<PhoneOrder> phoneOrderOrdersList =new ArrayList<>();
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Samsung"));
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Samsung"));
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Iphone"));
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Iphone"));
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Poco"));
        phoneOrderOrdersList.add(phoneOrderFactory.getPhoneOrderType("Poco"));
        for (PhoneOrder phoneOrder:phoneOrderOrdersList){
            phoneOrder.createPhoneOrder();
        }
    }
}