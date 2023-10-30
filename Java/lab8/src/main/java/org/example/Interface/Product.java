package org.example.Interface;
public abstract class Product {
    protected RepairStages repairStages;
    public RepairStages getRepairStages() {
        return repairStages;
    }

    public void setRepairStages(RepairStages repairStages) {
        this.repairStages = repairStages;
    }

    public Product(RepairStages repairStages) {
        this.repairStages = repairStages;
    }

    public abstract void getInfoAboutStage();
}
