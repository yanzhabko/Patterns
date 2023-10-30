package org.example.Product;
import org.example.Interface.Product;
import org.example.Interface.RepairStages;
public class Phone extends Product {
    public Phone(RepairStages repairStages) {
        super(repairStages);
    }
    @Override
    public void getInfoAboutStage() {
        System.out.println("The phone's");
        repairStages.doStage();
    }
}
