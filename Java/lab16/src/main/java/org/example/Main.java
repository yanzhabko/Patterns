package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CollectionOrder collectionOrder=new CollectionOrder(3);
        collectionOrder.addOrder(new Order("phoner","create"));
        collectionOrder.addOrder(new Order("phoner","repair"));
        collectionOrder.addOrder(new Order("phoner","sale"));
        collectionOrder.addOrder(new Order("phoner","saasdasdasdle"));
        Iterator<Order> iterator=collectionOrder.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}