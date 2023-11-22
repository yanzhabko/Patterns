package org.example;

public abstract class ConsultantAbstract {
    protected IMediator mediator;
    protected String name;
    protected String role;

    public ConsultantAbstract(IMediator mediator, String name, String role) {
        this.mediator = mediator;
        this.name = name;
        this.role = role;
    }
    public abstract void sendOrder(Order order);
    public abstract void getOrder(Order order);

}
