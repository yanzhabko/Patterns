package org.example;

public interface IMediator {
    void sendOrder(Order order, Consultant consultant);
    void addConsultant(ConsultantAbstract consultant);
}
