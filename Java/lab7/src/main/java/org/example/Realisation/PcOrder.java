package org.example.Realisation;

import org.example.Interface.IPcOrder;
public class PcOrder implements IPcOrder {
    @Override
    public void createPcOrder() {
        System.out.println("Your pc's order is complete");
    }
}
