from abc import ABCMeta, abstractmethod


class LaptopProduct(metaclass=ABCMeta):
    @abstractmethod
    def show_laptop_catalog(self):
        pass
