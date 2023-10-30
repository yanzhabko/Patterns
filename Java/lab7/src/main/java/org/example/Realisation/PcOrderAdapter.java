package org.example.Realisation;

import org.example.Interface.IPhoneOrder;
public class PcOrderAdapter implements IPhoneOrder {
    private PcOrder pcOrder;

    public PcOrderAdapter(PcOrder pcOrder) {
        this.pcOrder = pcOrder;
    }
    @Override
    public void createPhoneOrder() {
        pcOrder.createPcOrder();
    }
}
