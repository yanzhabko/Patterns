package org.example;

public class CreateOrder implements Command {
    Service service;

    public CreateOrder(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String name) {
        service.createOrder(name);
    }
}
