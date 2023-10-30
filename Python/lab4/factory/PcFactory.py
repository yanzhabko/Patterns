from interfaces.PcProduct import PcProduct
from interfaces.Factory import Factory
from pc.GamingPc import GamingPc
from pc.OficePc import OficePc
from interfaces.PhoneProduct import PhoneProduct
from interfaces.LaptopProduct import LaptopProduct


class PcFactory(Factory):
    def createPc(self, type_of_pc) -> PcProduct:
        if type_of_pc == 'Gaming':
            return GamingPc()
        elif type_of_pc == "Ofice":
            return OficePc()
        else:
            return None

    def createLaptop(self, type_of_pc) -> LaptopProduct:
        return None

    def createPhone(self, type_of_phone) -> PhoneProduct:
        return None
