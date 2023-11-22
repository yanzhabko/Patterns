package org.example;

public class Order {
    private final String name;
    private final String type;
    private PaymentMethod paymentMethod;
    boolean isClose;

    public Order(String name, String type) {
        this.name = name;
        this.type = type;
        isClose=false;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        if(!isClose){
            if (paymentMethod instanceof CardPayment){
                System.out.println("Type of payment was changed to CardPayment");
            }else if (paymentMethod instanceof CashPayment){
                System.out.println("Type of payment was changed to CashPayment");
            }else if (paymentMethod instanceof CheckPayment){
                System.out.println("Type of payment was changed to CheckPayment");
            }
            this.paymentMethod = paymentMethod;
        }else {
            System.out.println("The order is paid");
        }

    }

    public void doPayment(){
        if(!isClose){
            paymentMethod.doPayment();
            isClose=true;
        }else {
            System.out.println("The order:"+name+" type: "+type+" is paid");
        }
    }
}
