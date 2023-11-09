package org.example;

public class CallToClient implements Command {
    Service service;

    public CallToClient(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String phone) {
        service.callToClient(phone);
    }
}
