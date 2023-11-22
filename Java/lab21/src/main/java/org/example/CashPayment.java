package org.example;

public class CashPayment implements PaymentMethod{
    @Override
    public void doPayment() {
        System.out.println("Transavtion succsessful with CashPayment");
    }
}
