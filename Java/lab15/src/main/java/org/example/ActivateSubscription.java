package org.example;

public class ActivateSubscription implements Command {
    Service service;

    public ActivateSubscription(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String login) {
        service.activateSubscription(login);
    }
}
