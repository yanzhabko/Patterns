package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneOrderFactory {
    private final Map<String, PhoneOrder> phoneMap=new HashMap<>();
     public PhoneOrder getPhoneOrderType(String typePhoneOrder){
         PhoneOrder phoneOrder =phoneMap.get(typePhoneOrder);
         if(phoneOrder ==null){
             phoneOrder =new PhoneOrder(typePhoneOrder);
             System.out.println("Creating type of phone order like "+ phoneOrder.name);
             phoneMap.put(typePhoneOrder, phoneOrder);
         }
         return phoneOrder;
     }
}
