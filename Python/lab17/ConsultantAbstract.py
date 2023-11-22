from IMediator import IMediator
from abc import ABC, abstractmethod
from Order import Order


class ConsultantAbstract(ABC):
    def __init__(self, mediator, name, role):
        self.mediator = mediator
        self.name = name
        self.role = role

    @abstractmethod
    def send_order(self, order: Order):
        pass

    @abstractmethod
    def get_order(self, order: Order):
        pass
