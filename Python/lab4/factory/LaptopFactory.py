from interfaces.LaptopProduct import LaptopProduct
from interfaces.PcProduct import PcProduct
from interfaces.PhoneProduct import PhoneProduct
from interfaces.Factory import Factory

# Імпорт конкретних класів GamingLaptop і OficeLaptop з відповідних модулів
from laptop.GamingLaptop import GamingLaptop
from laptop.OficeLaptop import OficeLaptop

class LaptopFactory(Factory):
    def createLaptop(self, type_of_laptop) -> LaptopProduct:
        if type_of_laptop == 'Gaming':
            return GamingLaptop()
        elif type_of_laptop == "Ofice":
            return OficeLaptop()
        else:
            return None

    def createPc(self, type_of_pc) -> PcProduct:
        return None

    def createPhone(self, type_of_phone) -> PhoneProduct:
        return None
