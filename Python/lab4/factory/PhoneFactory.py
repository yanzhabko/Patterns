from interfaces.PhoneProduct import PhoneProduct
from interfaces.Factory import Factory
from phone.Iphone import Iphone
from phone.Pixel import Pixel
from phone.Samsung import Samsung
from interfaces.LaptopProduct import LaptopProduct
from interfaces.PcProduct import PcProduct

class PhoneFactory(Factory):
    def createPhone(self, type_of_phone) -> PhoneProduct:
        if type_of_phone == 'Samsung':
            return Samsung()
        elif type_of_phone == "Pixel":
            return Pixel()
        elif type_of_phone == "Iphone":
            return Iphone()
        else:
            return None

    def createPc(self, type_of_pc) -> PcProduct:
        return None

    def createLaptop(self, type_of_pc) -> LaptopProduct:
        return None
