from abc import ABC, abstractmethod


class IMediator(ABC):
    @abstractmethod
    def add_consultant(self, consultant):
        pass

    @abstractmethod
    def send_order(self, order, consultant):
        pass
