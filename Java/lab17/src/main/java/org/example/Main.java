package org.example;

public class Main {
    public static void main(String[] args) {
        IMediator mediator=new Mediator();
        ConsultantAbstract consultantRoma=new Consultant(mediator,"roma","Intern");
        ConsultantAbstract consultantVlad=new Consultant(mediator,"vlad","junior");
        ConsultantAbstract consultantVasya=new Consultant(mediator,"vasya","middle");
        ConsultantAbstract consultantPrtya=new Consultant(mediator,"petya","senior");
        mediator.addConsultant(consultantRoma);
        mediator.addConsultant(consultantVlad);
        mediator.addConsultant(consultantVasya);
        mediator.addConsultant(consultantPrtya);
        consultantRoma.sendOrder(new Order("repair phone","repair"));
        System.out.println();
        consultantPrtya.sendOrder(new Order("create pc","create"));
    }
}