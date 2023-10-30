package org.example.Stage;
import org.example.Interface.RepairStages;
public class SecondStage implements RepairStages {
    @Override
    public void doStage() {
        System.out.println("repair work continues\n");
    }
}
