from abc import ABC, abstractmethod

class Component(ABC):
    @abstractmethod
    def repair(self):
        pass
