package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator{
    private final List<ConsultantAbstract> consultantList=new ArrayList<>();
    @Override
    public void addConsultant(ConsultantAbstract consultant){
        consultantList.add(consultant);
    }
    @Override
    public void sendOrder(Order order,Consultant consultant) {
        for(ConsultantAbstract c:consultantList){
            if(c!=consultant){
                c.getOrder(order);
            }
        }
    }
}
