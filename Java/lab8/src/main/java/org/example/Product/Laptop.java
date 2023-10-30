package org.example.Product;
import org.example.Interface.Product;
import org.example.Interface.RepairStages;
        '
public class Laptop extends Product {
    public Laptop(RepairStages repairStages) {
        super(repairStages);
    }
    @Override
    public void getInfoAboutStage() {
        System.out.println("The laptop's");
        repairStages.doStage();
    }
}
