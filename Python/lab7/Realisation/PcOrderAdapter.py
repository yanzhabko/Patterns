from Interfaces.IPhoneOrder import IPhoneOrder
from Realisation.PcOrder import PcOrder

class PcOrderAdapter(IPhoneOrder):
    def __init__(self, pc_order: PcOrder):
        self.pc_order = pc_order

    def createPhoneOrder(self):
        self.pc_order.createPcOrder()
