from Interfaces.IPhoneOrder import IPhoneOrder

class PhoneOrder(IPhoneOrder):
    def createPhoneOrder(self):
        print("Your phone's order is complete")
