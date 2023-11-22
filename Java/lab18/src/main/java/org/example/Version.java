package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Version {
    private final LinkedList<Order> orderList=new LinkedList<>();

    public void addVersion(Order order){
        orderList.add(order);
    }

    public LinkedList<Order> getOrderList() {
        return orderList;
    }

    public Order getVersion(int version){
        return  orderList.get(version-1);
    }
}
