from factory.LaptopFactory import LaptopFactory
from factory.PcFactory import PcFactory
from factory.PhoneFactory import PhoneFactory
from interfaces.Factory import Factory

class ProductFactory():
    def create_factory(self, type_of_factory) -> Factory:
        if type_of_factory == 'Phone':
            return PhoneFactory()
        elif type_of_factory == "PC":
            return PcFactory()
        elif type_of_factory == "Laptop":
            return LaptopFactory()
        else:
            return None
