from abc import ABC, abstractmethod
class RepairStages(ABC):
    @abstractmethod
    def do_stage(self):
        pass

