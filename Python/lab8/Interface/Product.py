from abc import ABC, abstractmethod
from Interface.RepairStages import RepairStages

class Product(ABC):
    def __init__(self, repair_stages: RepairStages):
        self.repair_stages = repair_stages

    def get_repair_stages(self):
        return self.repair_stages

    @abstractmethod
    def get_info_about_stage(self):
        pass
