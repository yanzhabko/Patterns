from abc import ABC, abstractmethod

class Worker(ABC):
    @abstractmethod
    def doWork(self) -> str:
        pass
