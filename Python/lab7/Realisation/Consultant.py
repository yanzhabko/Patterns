from Interfaces.IPhoneOrder import IPhoneOrder

class Consultant:
    def create_order(self, phoneOrder: IPhoneOrder):
        phoneOrder.createPhoneOrder()