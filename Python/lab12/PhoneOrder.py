class PhoneOrder:
    def __init__(self, name: str):
        self.name = name

    def create_phone_order(self):
        print("Phone order for " + self.name + " created")
