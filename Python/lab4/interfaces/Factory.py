from abc import ABCMeta, abstractmethod
from interfaces.LaptopProduct import LaptopProduct
from interfaces.PcProduct import PcProduct
from interfaces.PhoneProduct import PhoneProduct

class Factory(metaclass=ABCMeta):
    @abstractmethod
    def createLaptop(self, type_of_laptop) -> LaptopProduct:
        pass

    @abstractmethod
    def createPc(self, type_of_pc) -> PcProduct:
        pass

    @abstractmethod
    def createPhone(self, type_of_phone) -> PhoneProduct:
        pass
