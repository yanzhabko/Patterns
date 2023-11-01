from Component import Component

class Motherboard(Component):
    def __init__(self, name: str):
        self.name = name

    def repair(self):
        print("We repair " + self.name)