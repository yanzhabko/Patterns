package org.example;

public class Consultant extends ConsultantAbstract{
    public Consultant(IMediator mediator, String name, String role) {
        super(mediator, name, role);
    }

    @Override
    public void sendOrder(Order order) {
        System.out.println("Consultant: "+name+", role: "+role+", send order: "+order);
        mediator.sendOrder(order,this);
    }

    @Override
    public void getOrder(Order order) {
        System.out.println("Consultant: "+name+", role: "+role+", get order: "+order);
    }
}
