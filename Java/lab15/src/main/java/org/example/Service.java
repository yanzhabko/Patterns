package org.example;

public class Service {
    public void createOrder(String name){
        System.out.println("Order: "+name+", create");
    }
    public void deleteOrder(String name){
        System.out.println("Order: "+name+", delete");
    }
    public void activateSubscription(String login){
        System.out.println("Subscription for user: "+login+", activated");
    }
    public void callToClient(String phone){
        System.out.println("Calling to: "+phone);
    }
}
