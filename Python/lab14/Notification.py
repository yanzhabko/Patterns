from abc import ABC, abstractmethod

class Notification(ABC):
    _next = None

    def __init__(self, priority: int):
        self.priority = priority

    def set_next(self, next):
        self._next = next

    def give_to_next_repairman(self,message:str,level:int):
        if level>=self.priority:
            self.print_message(message)
        if self._next!=None:
            self._next.give_to_next_repairman(message,level)

    @abstractmethod
    def print_message(self,message:str):
        pass