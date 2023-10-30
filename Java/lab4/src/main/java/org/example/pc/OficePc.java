package org.example.pc;

import org.example.interfaces.PcProduct;
public class OficePc implements PcProduct {
    @Override
    public void showPcCatalog() {
        System.out.println("""
                1.Компьютер Cobra Optimal 9000грн
                2.Компьютер HP Pavilion 550-113nl 12000грн
                3.Компьютер HP 290 G1 MT 10000грн
                4.Компьютер Lenovo ThinkCentre M710s SFF 10000грн
                5.Компьютер Lenovo ThinkCentre M720s SFF 15000грн
                """);
    }
}
