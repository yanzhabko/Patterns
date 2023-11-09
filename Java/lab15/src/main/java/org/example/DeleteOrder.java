package org.example;

public class DeleteOrder implements Command {
    Service service;

    public DeleteOrder(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String name) {
        service.deleteOrder(name);
    }
}