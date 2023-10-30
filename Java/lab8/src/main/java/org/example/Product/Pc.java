package org.example.Product;
import org.example.Interface.Product;
import org.example.Interface.RepairStages;

public class Pc extends Product {
    public Pc(RepairStages repairStages) {
        super(repairStages);
    }
    @Override
    public void getInfoAboutStage() {
        System.out.println("The pc's");
        repairStages.doStage();
    }
}
