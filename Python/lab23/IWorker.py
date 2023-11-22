from abc import ABC, abstractmethod


class IWorker(ABC):
    @abstractmethod
    def do_consultation(self):
        pass

    @abstractmethod
    def create_order(self):
        pass
