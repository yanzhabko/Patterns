package org.example;

public class Main {
    public static void main(String[] args) {
        Service service =new Service();
        Consultant consultant=new Consultant(
                new CallToClient(service),
                new CreateOrder(service),
                new DeleteOrder(service),
                new ActivateSubscription(service)
        );
        consultant.callToClient("0501726116");
        consultant.createOrder("Reapair Iphone 15");
        consultant.deleteOrder("Create PC");
        consultant.activateSubscription("prozaik");
    }
}