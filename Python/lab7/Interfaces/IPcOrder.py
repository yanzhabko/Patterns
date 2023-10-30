from abc import ABC, abstractmethod

class IPcOrder(ABC):
    @abstractmethod
    def createPcOrder(self):
        pass
