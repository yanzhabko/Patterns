package org.example;

public class Consultant {
    CallToClient callToClient;
    CreateOrder createOrder;
    DeleteOrder deleteOrder;
    ActivateSubscription activateSubscription;

    public Consultant(CallToClient callToClient, CreateOrder createOrder, DeleteOrder deleteOrder,
                      ActivateSubscription activateSubscription) {
        this.callToClient = callToClient;
        this.createOrder = createOrder;
        this.deleteOrder = deleteOrder;
        this.activateSubscription = activateSubscription;
    }
    public  void  createOrder(String name){
        createOrder.execute(name);
    }
    public  void  deleteOrder(String name){
        deleteOrder.execute(name);
    }
    public  void  callToClient(String phone){
        callToClient.execute(phone);
    }
    public  void  activateSubscription(String login){
        activateSubscription.execute(login);
    }
}
