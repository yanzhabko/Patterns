from abc import ABC, abstractmethod

class IPhoneOrder(ABC):
    @abstractmethod
    def createPhoneOrder(self):
        pass
