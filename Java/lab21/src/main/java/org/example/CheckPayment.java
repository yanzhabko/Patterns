package org.example;

public class CheckPayment implements PaymentMethod{
    @Override
    public void doPayment() {
        System.out.println("Transavtion succsessful with CheckPayment");
    }
}
