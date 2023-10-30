package org.example.Stage;
import org.example.Interface.RepairStages;
public class FirstStage implements RepairStages {
    @Override
    public void doStage() {
        System.out.println("repair work has started\n");
    }
}
