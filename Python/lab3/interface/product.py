
from abc import ABCMeta, abstractmethod


class Product(metaclass=ABCMeta):
    @abstractmethod
    def get_product(self):
        pass
