package org.example;

import org.example.Realisation.Consultant;
import org.example.Realisation.PcOrder;
import org.example.Realisation.PcOrderAdapter;
import org.example.Realisation.PhoneOrder;

public class Main {
    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        consultant.createOrder(new PhoneOrder());

        System.out.println();
        consultant.createOrder(new PcOrderAdapter(new PcOrder()));
    }
}
