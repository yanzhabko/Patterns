package org.example;

public class CardPayment implements PaymentMethod{
    @Override
    public void doPayment() {
        System.out.println("Transavtion succsessful with CardPayment");
    }
}
